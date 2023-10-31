package com.company;


import java.util.List;

public class Reports {
    public static void staffListReport(User user) {
        System.out.println("Staff List for " + user.getName());
        if (user instanceof Manager) {
            List<Staff> staffList = ((Manager) user).getStaff();
            for (Staff staff : staffList) {
                System.out.println("ID: " + staff.getID() + ", Name: " + staff.getName());
            }
        } else if (user instanceof Director) {
            List<Manager> managers = ((Director) user).getManagers();
            for (Manager manager : managers) {
                List<Staff> staffList = manager.getStaff();
                System.out.println("Manager: " + manager.getName());
                for (Staff staff : staffList) {
                    System.out.println("ID: " + staff.getID() + ", Name: " + staff.getName());
                }
            }
        }
    }

    public static void budgetReport(User user) {
        System.out.println("Budget Report for " + user.getName());
        if (user instanceof Manager) {
            Manager manager = (Manager) user;
            double budget = manager.getHourlyRate() * manager.getTotalHours();
            System.out.println("Total Budget: " + budget);
        } else if (user instanceof Director) {
            Director director = (Director) user;
            double budget = 0;
            List<Manager> managers = director.getManagers();
            for (Manager manager : managers) {
                budget += manager.getHourlyRate() * manager.getTotalHours();
            }
            System.out.println("Total Budget: " + budget);
        }
    }
}
