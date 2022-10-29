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
public class HospitalDirectory {
    
    ArrayList<Hospital> hospitalList;
    
    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(ArrayList<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }

    public HospitalDirectory() {
        this.hospitalList = new ArrayList<Hospital>();
    }
    
    public void addHospital(Hospital hospital) {
        hospitalList.add(hospital);
    }

    public void deleteHospital(Hospital hospital) {
        hospitalList.remove(hospital);
    }
    
    public void updateHospital(Hospital hospital) {
        Hospital newHospital = new Hospital();
        
        int position = 0;
        for (int iter = 0; iter < hospitalList.size(); iter++) {
            if((hospitalList.get(iter).getHospitalId()) == (hospital.getHospitalId())) {
                position = iter;
                break;
            }
        }
        
        newHospital.setHospitalId(hospital.getHospitalId());
        newHospital.setHospitalName(hospital.getHospitalName());
        newHospital.setAddress(hospital.getAddress());
        newHospital.setCommunity(hospital.getCommunity());
        
        hospitalList.set(position, newHospital);
    }
    
    public ArrayList<Hospital> getHospitalsInCommunity(int communityId) {
        
        ArrayList<Hospital> selectedHospitals = new ArrayList<Hospital>();
        for(Hospital hospital : hospitalList) {
            if(hospital.getCommunity().getCommunityId() == communityId) {
                selectedHospitals.add(hospital);
            }
        }
        return(selectedHospitals);
    }

    public Hospital hospitalDetails(int hospitalId) {
        
        for(Hospital hospital : hospitalList) {
            if(hospital.getHospitalId() == hospitalId) {
                return hospital;
            }
        }
        return null;
    }
}
