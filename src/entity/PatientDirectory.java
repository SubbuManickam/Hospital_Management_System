/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.List;

/**
 *
 * @author Asus
 */
public class PatientDirectory {
    
    List<Patient> patientList;
    AdminSystem adminSystem;

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }

    public AdminSystem getAdminSystem() {
        return adminSystem;
    }

    public void setAdminSystem(AdminSystem adminSystem) {
        this.adminSystem = adminSystem;
    }
    
}
