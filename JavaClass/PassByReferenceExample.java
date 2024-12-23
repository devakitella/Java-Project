package JavaClass;

public class PassByReferenceExample {
    public static void modifyName(PassByReference pbr) {
        pbr.name = "Hemanth";
    }

    public static void main(String[] args) {
        PassByReference p = new PassByReference();
        p.name = "Devaki";
        System.out.println("Before modifying: " + p.name);
        modifyName(p);
        System.out.println("After modifying: " + p.name);
    }
}
