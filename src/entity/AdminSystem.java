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
public class AdminSystem {
    
    DoctorDirectory doctorDirectory;
    PatientDirectory patientDirectory;
    PersonDirectory personDirectory;
    HospitalDirectory hospitalDirectory;
    ArrayList<City> cityList;

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public ArrayList<City> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<City> cityList) {
        this.cityList = cityList;
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public void addCity(City city) {
        cityList.add(city);
    }

    public AdminSystem() {
        this.cityList = new ArrayList<City>();
    }

    public void deleteCity(City city) {
        cityList.remove(city);
    }
    
    public void updateCity(City city) {
        City newCity = new City();
        
        int position = 0;
        for (int iter = 0; iter < cityList.size(); iter++) {
            if((cityList.get(iter).getCityId()) == (city.getCityId())) {
                position = iter;
                break;
            }
        }
        
        newCity.setCityId(city.getCityId());
        newCity.setCityName(city.getCityName());
        newCity.setState(city.getState());
        
        cityList.set(position, newCity);
    }
}
