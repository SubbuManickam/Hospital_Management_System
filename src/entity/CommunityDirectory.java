/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class CommunityDirectory {
    
    ArrayList<Community> communityList;

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }
   
    public CommunityDirectory() {
        this.communityList = new ArrayList<Community>();
    }
    
    public void addCommunity(Community community) {
        communityList.add(community);
    }

    public void deleteCommunity(Community community) {
        communityList.remove(community);
    }
    
    public void updateCommunity(Community community) {
        Community newCommunity = new Community();
        
        int position = 0;
        for (int iter = 0; iter < communityList.size(); iter++) {
            if((communityList.get(iter).getCommunityId()) == (community.getCommunityId())) {
                position = iter;
                break;
            }
        }
        
        newCommunity.setCommunityId(community.getCommunityId());
        newCommunity.setCommunityName(community.getCommunityName());
        newCommunity.setCity(community.getCity());
        
        communityList.set(position, newCommunity);
    }
    
    public Community communityDetails(int communityId) {
        
        for(Community community : communityList) {
            if(community.getCommunityId() == communityId) {
                return community;
            }
        }
        return null;
    }
}
