package Interview;

public class DecoratorExample {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape coloredCircle = new ColorDecorator(circle);
        System.out.println(circle.draw());
        System.out.println(coloredCircle.draw());
    }
}
