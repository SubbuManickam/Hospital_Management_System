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
public class CityDirectory {
    
    ArrayList<City> cityList;

    public ArrayList<City> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<City> cityList) {
        this.cityList = cityList;
    }
    
    public void addCity(City city) {
        cityList.add(city);
    }

    public CityDirectory() {
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
