package Package2;

import Package1.*;

public class Patient1 {
    public static void main(String[] args) {
        Patient pat = new Patient();

        System.out.println("Before Updating:");
        System.out.println("---------------");
        pat.getPatientDetails();

        pat.setName("Lily");
        pat.setAge(39);
        pat.setDisease("Tooth cavity");
        pat.setRequiredMedication(false);

        System.out.println("\nAfter Updating:");
        System.out.println("---------------");
        pat.getPatientDetails();
    }
}
