package Assignment;

public class DayOfYear {

    public static void main(String[] args) {
        System.out.println(dayOfYear("2019-01-09"));
        System.out.println(dayOfYear("2019-02-10"));
    }

    public static int dayOfYear(String date) {
        
        int yy = Integer.parseInt(date.substring(0, 4));
        int mm = Integer.parseInt(date.substring(5, 7));
        int dd = Integer.parseInt(date.substring(8, 10));

        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (isLeapYear(yy)) {
            daysInMonth[1] = 29;
        }

        int dayOfYear = 0;
        for (int i = 0; i < mm - 1; i++) {
            dayOfYear += daysInMonth[i];
        }
        dayOfYear += dd;

        return dayOfYear;
    }

    private static boolean isLeapYear(int yy) {
        return (yy % 4 == 0 && yy % 100 != 0) || (yy % 400 == 0);
    }

}
