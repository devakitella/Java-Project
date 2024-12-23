package Package2;

import Package1.*;

import java.util.Scanner;

public class Doctor1 {
    public static void main(String[] args) {
        // I have created a object for Doctor Class
        Doctor doc = new Doctor();

        System.out.println("Original Name: " + doc.getName());
        System.out.println("Specialization: " + doc.getSpecialization());
        System.out.println("Experience: " + doc.getYearsOfExperience());

        String updatedName;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        updatedName = sc.nextLine();
        updatedName = doc.setName(updatedName);

        System.out.println("Updated Name: " + updatedName);
        System.out.println("Updated Specialization: " + doc.setSpecialization("Heart Surgeon"));
        System.out.println("Updated Experience: " + doc.setYearsOfExperience(10));

    }
}
