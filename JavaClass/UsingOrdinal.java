package JavaClass;

enum Seasons {
    WINTER,
    SUMMER,
    RAINY
}

public class UsingOrdinal {
    public static void main(String[] args) {
        int val = Seasons.RAINY.ordinal();
        switch(val) {
            case 0:
                System.out.println("Winter Season");
                break;
            case 1:
                System.out.println("Summer Season");
                break;
            case 2:
                System.out.println("Rainy Season");
                break;
        }
    }
}
