package Package1;

public class Doctor {
    String name = "Devaki";
    String specialization = "General Medicine";
    int yearsOfExperience = 5;

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String setSpecialization(String specialization) {
        this.specialization = specialization;
        return specialization;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public int setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
        return yearsOfExperience;
    }

    public static void main(String[] args) {
        Doctor d = new Doctor();
        System.out.println(d.name);
    }
}
