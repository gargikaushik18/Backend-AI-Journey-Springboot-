class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Day8_2 {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();
        d.bark();
    }
}

// inheritence done by extends
// Child class inherits parent properties.
// car->vehicle