package JavaClass;

public class ClassLevelVars {
    String name = "Devaki";
    int age = 24;
    String location = "USA";
    String qualification = "Masters";

    public static void main(String[] args) {
        ClassLevelVars clv = new ClassLevelVars();
        System.out.println("Name: " + clv.name);
        System.out.println("Age: " + clv.age);
        System.out.println("Location: " + clv.location);
        System.out.println("Qualification: " + clv.qualification);
    }

}
