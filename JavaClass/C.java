package JavaClass;

public class C implements A, B{
    @Override
    public void display() {
        System.out.println("Resolving the Diamond Problem:");
        A.super.display(); // Calls A's display method
        B.super.display(); // Calls B's display method
        System.out.println("Display from C");
    }
}
