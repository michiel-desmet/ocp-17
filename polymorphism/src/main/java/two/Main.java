package two;

/**
 * Write a Java program to create a class Vehicle with a method called speedUp(). Create two subclasses Car and Bicycle.
 * Override the speedUp() method in each subclass to increase the vehicle's speed differently.
 */
public class Main {

    public static void main(String[] args) {

    }

}

class Vehicle {
    public int speedUp() {
        return 0;
    }
}

class Car extends Vehicle {
    @Override
    public int speedUp() {
        return 10;
    }
}

class Bicycle extends Vehicle {
    @Override
    public int speedUp() {
        return 2;
    }
}
