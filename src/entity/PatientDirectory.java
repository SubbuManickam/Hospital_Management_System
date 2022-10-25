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
  
    public Patient addData() {
        Patient patient = new Patient();
        patientList.add(patient);
        return patient;
    }
    
    public Patient viewData(int uniqueId) {
        
        for(Patient patient : patientList) {
            if(patient.getPatientId() == uniqueId) {
                return patient;
            }
        }
        return null;
    }
}
