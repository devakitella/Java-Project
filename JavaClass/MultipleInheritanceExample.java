package JavaClass;

public class MultipleInheritanceExample implements InterfaceA, InterfaceB{

    public void methodA() {
        System.out.println("This is InterfaceA");
    }

    public void methodB() {
        System.out.println("This is InterfaceB");
    }

    public static void main(String[] args) {
        MultipleInheritanceExample mie = new MultipleInheritanceExample();
        mie.methodA();
        mie.methodB();
    }
}
