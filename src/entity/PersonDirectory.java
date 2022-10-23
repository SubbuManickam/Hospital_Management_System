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
public class PersonDirectory {
    
    List<Person> personList;
    AdminSystem adminSystem;

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public AdminSystem getAdminSystem() {
        return adminSystem;
    }

    public void setAdminSystem(AdminSystem adminSystem) {
        this.adminSystem = adminSystem;
    }
    
}
