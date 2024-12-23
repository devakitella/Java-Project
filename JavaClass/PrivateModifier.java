package JavaClass;

public class PrivateModifier {
    private String secret = "This is a secret message";

    private void displaySecret() {
        System.out.println("Secret: " + secret);
    }

    public static void main(String[] args) {
        PrivateModifier pm = new PrivateModifier();
        pm.displaySecret();
    }
}
