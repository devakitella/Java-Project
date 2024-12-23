package JavaClass;

public class PassByValue {
    public static void modifyValue(int num) {
        num = 20;
        System.out.println("Inside method: " + num);
    }
    
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Before method call: " + a);
        modifyValue(a);
        System.out.println("After method call: " + a);
    }
}
