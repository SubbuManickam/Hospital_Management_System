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
public class DoctorDirectory {
    
    ArrayList<Doctor> doctorList;
    Hospital hospital;

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    
    public DoctorDirectory() {
        this.doctorList = new ArrayList<Doctor>();
    }
    
    public void addDoctor(Doctor doctor) {
        doctorList.add(doctor);
    }

    public void deleteDoctor(Doctor doctor) {
        doctorList.remove(doctor);
    }
    
    public void updateDoctor(Doctor doctor) {
        Doctor newDoctor = new Doctor();
        
        int position = 0;
        for (int iter = 0; iter < doctorList.size(); iter++) {
            if((doctorList.get(iter).getDoctorId()) == (doctor.getDoctorId())) {
                position = iter;
                break;
            }
        }
        
        newDoctor.setDoctorId(doctor.getDoctorId());
        newDoctor.setPerson(doctor.getPerson());
        newDoctor.setHospital(doctor.getHospital());
        
        doctorList.set(position, newDoctor);
    }

    public ArrayList<Doctor> getDoctorsInHospital(int hospitalId) {
        
        ArrayList<Doctor> selectedDoctors = new ArrayList<Doctor>();
        for(Doctor doctor : doctorList) {
            if(doctor.getHospital().getHospitalId() == hospitalId) {
                selectedDoctors.add(doctor);
            }
        }
        return(selectedDoctors);
    }
}
