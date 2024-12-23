package JavaClass;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {
    public static void main(String[] args) {
        String path="C://Users//devak//Downloads/person.txt";
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path))) {
            Person person = new Person("Devaki Tella", 24);
            out.writeObject(person);  // Serialize the object
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
