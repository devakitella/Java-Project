package JavaClass;

public class GetNextDay {
    public static void main(String[] args) {
        System.out.println("After Monday: " + getNextMonth(Day.MONDAY));
        System.out.println("After Thursday: " + getNextMonth(Day.THURSDAY));
    }

    public static Day getNextMonth(Day day) {
        int ordinal = day == Day.SUNDAY ? 0 : day.ordinal() + 1;
        return Day.values()[ordinal];
    }
}
