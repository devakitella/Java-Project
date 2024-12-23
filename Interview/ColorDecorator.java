package Interview;

public class ColorDecorator implements Shape {
    private Shape shape;
    public ColorDecorator(Shape shape) {
        this.shape = shape;
    }
    public String draw() {
        return shape.draw() + " with color";
    }
}
