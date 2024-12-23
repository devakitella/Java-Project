package JavaClass;

enum Levels {
    LOW,
    MEDIUM,
    HIGH
}

public class LevelsEnumExample {
    public static void main(String[] args) {
        Levels level = Levels.MEDIUM;
        switch(level) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }
}