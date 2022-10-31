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
public class EncouterHistory {
    
    ArrayList<Encounter> encounterList;
    
    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(ArrayList<Encounter> encounterList) {
        this.encounterList = encounterList;
    }
    
    public EncouterHistory() {
        this.encounterList = new ArrayList<Encounter>();
    }
    
    public ArrayList<Encounter> getEncounterData(int patientId) {
        ArrayList<Encounter> encounterHistory = new ArrayList<Encounter>();
        
        for(Encounter encounter : encounterList) {
            if(encounter.getPatient().getPatientId() == patientId) {
                encounterHistory.add(encounter);
            }
        }
        return encounterHistory;
    }
    
    public void addEncounter(Encounter encounter) {
        encounterList.add(encounter);
    }
}
