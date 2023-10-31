package com.company;

import java.util.ArrayList;
import java.util.List;

public class Manager extends User{

    private List<Staff> staff;

    public Manager(int ID, String name, int age, double hourlyRate, int totalHours) {
        super(ID, name, age, hourlyRate, totalHours);
        staff = new ArrayList<>();
        Database.addUser(this);
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public void addStaff(Staff staffMember) {
        staff.add(staffMember);
    }
}
