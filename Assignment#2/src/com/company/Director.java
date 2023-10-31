package com.company;

import java.util.ArrayList;
import java.util.List;

public class Director extends User {

    private List<Manager> managers;//every manager have list of staff

    public Director(int ID, String name, int age, double hourlyRate, int totalHours) {
        super(ID, name, age, hourlyRate, totalHours);
        managers = new ArrayList<>();
        Database.addUser(this);
    }

    public List<Manager> getManagers() {
        return managers;
    }

    public void addManager(Manager manager) {
        managers.add(manager);
    }

}
