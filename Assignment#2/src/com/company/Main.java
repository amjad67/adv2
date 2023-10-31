package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Director director = new Director(1, "Amjad", 45, 50.0, 160);
        Manager manager = new Manager(2, "Ahmad", 35, 40.0, 160);
        Manager manager2 = new Manager(3, "Kareem", 40, 40.0, 160);
        Staff staff1 = new Staff(4, "Noor", 25, 20.0, 160);
        Staff staff2 = new Staff(5, "Ameer", 28, 20.0, 160);
        Staff staff3 = new Staff(6, "Omar", 31, 20.0, 160);
        Staff staff4 = new Staff(7, "Rami", 23, 20.0, 160);


        director.addManager(manager);
        director.addManager(manager2);

        manager.addStaff(staff1);
        manager.addStaff(staff2);
        manager2.addStaff(staff3);
        manager2.addStaff(staff4);



        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of a Director or Manager: ");
        String name = scanner.nextLine();
        User user = Database.getUserByName(name);

        if (user != null) {
            Reports.staffListReport(user);
            Reports.budgetReport(user);
        } else {
            System.out.println("User not found.");
        }
    }
}
