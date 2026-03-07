// Abstraction means hiding internal implementation and showing only essential features.
// example- only car steering and accelerator shown

// In Java abstraction is achieved using:Abstract Class , Interface

// example of abstract class- All shapes have area(), but the formula is different.
abstract class Animal {

    abstract void sound();

    void sleep() {
        System.out.println("Animal sleeps");
    }

}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }

}

public class Day8_5 {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.sleep();
    }
}
