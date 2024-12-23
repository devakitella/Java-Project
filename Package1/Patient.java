package Package1;

public class Patient {
    String name = "Daisy";
    int age = 20;
    String disease = "Pneumonia";
    boolean requiredMedication = true;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setRequiredMedication(boolean requiredMedication) {
        this.requiredMedication = requiredMedication;
    }

    public void getPatientDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
        System.out.println("Required Medication: " + requiredMedication);
    }

    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        System.out.println(doctor.getName());
        System.out.println(doctor.getYearsOfExperience());
    }

}
