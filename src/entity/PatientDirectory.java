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
public class PatientDirectory {
    
    ArrayList<Patient> patientList;
    
    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
    public PatientDirectory() {
        this.patientList = new ArrayList<Patient>();
    }
  
    public void  addPatient(Patient patient) {
        patientList.add(patient);
    }
    
    public Patient viewData(int uniqueId) {
        
        for(Patient patient : patientList) {
            if(patient.getPatientId() == uniqueId) {
                return patient;
            }
        }
        return null;
    }

    public void deletePatient(Patient patient) {
        patientList.remove(patient);
    }
    
    public void updatePatient(Patient patient) {
        Patient newPatient = new Patient();
        
        int position = 0;
        for (int iter = 0; iter < patientList.size(); iter++) {
            if((patientList.get(iter).getPatientId()) == (patient.getPatientId())) {
                position = iter;
                break;
            }
        }
        
        newPatient.setPatientId(patient.getPatientId());
        newPatient.setPerson(patient.getPerson());
        newPatient.setEncounterHitory(patient.getEncounterHitory());
        newPatient.setBloodGroup(patient.getBloodGroup());
        
        patientList.set(position, newPatient);
    }
    
    public String patientIdValidation (Patient patient) {
        for(int i=0; i<patientList.size(); i++) {
            if(patient.getPatientId() == patientList.get(i).getPatientId()) {
                return ("Please enter a unique Patient ID");
            }
        }
        
        return ("Valid");
    }
}
