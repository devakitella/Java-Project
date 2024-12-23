package JavaClass;

public class UsingInAnotherClass {
    public static void main(String[] args) {
        Day[] day = Day.values();
        for(Day d: day){
            System.out.println(d + " - " + d.ordinal());
        }
    }
}
