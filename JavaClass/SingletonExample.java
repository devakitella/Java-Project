package JavaClass;

//Singleton Class Example
//Singleton is the class which has only one instance. We can restrict object creation by using singleton class.
//Creating singleton class:
//1. Make constructor private
//2. Declare a static instance variable
//3. Create a public static method

public class SingletonExample {
    private static Single s; //creating a private static variable

    private SingletonExample() { // Make constructor private
    }

    public static Single getInstance() { //Create a public static method
        if(s == null)
        {
            s = new Single();
        }
        return s;
    }
}

