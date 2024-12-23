package JavaClass;

public class Car {
    private Engine engine;
    Car() {
        engine = new Engine();
    }
    void startCar() {
        engine.start(); // Car delegates the behavior to Engine
        System.out.println("Car starts moving.");
    }
}
