package com.company;

public class User {
    private int ID;
    private String name;
    private int age;
    private double hourlyRate;
    private int totalHours;

    public User(int ID, String name, int age, double hourlyRate, int totalHours) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.hourlyRate = hourlyRate;
        this.totalHours = totalHours;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getTotalHours() {
        return totalHours;
    }


}
