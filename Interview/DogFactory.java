package Interview;

public class DogFactory extends AnimalFactory {
    public Animal createAnimal() {
        return new Dog();
    }
    public static void main(String[] args) {
        AnimalFactory factory = new DogFactory();
        Animal animal = factory.createAnimal();
        animal.sound();  // Output: Bark
    }
}
