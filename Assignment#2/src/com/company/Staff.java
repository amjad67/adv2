package com.company;


public class Staff extends User{
    public Staff(int ID, String name, int age, double hourlyRate, int totalHours) {
        super(ID, name, age, hourlyRate, totalHours);
        Database.addUser(this);
    }

}
