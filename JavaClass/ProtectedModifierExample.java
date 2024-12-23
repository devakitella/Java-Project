package JavaClass;

public class ProtectedModifierExample extends ProtectedModifier {
    void displayNumber() {
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        ProtectedModifierExample pme = new ProtectedModifierExample();
        pme.displayNumber();
    }
}
