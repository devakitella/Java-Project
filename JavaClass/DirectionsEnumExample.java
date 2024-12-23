package JavaClass;

enum Directions {
    NORTH,
    SOUTH,
    EAST,
    WEST
}

public class DirectionsEnumExample {
    public static void main(String[] args) {
        for(Directions dir: Directions.values()) {
            System.out.println(dir + " - " + dir.ordinal());
        }
    }
}
