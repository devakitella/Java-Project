package JavaClass;

enum Day{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class EnumExample {
    public static void main(String[] args) {
        for (Day day: Day.values())
            System.out.println(day);
    }
}
