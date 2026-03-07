// An interface is a completely abstract blueprint.
// It contains only method declarations.
// done by "implements"
// example- each TV implements same buttons differently.

interface Animal {

    void sound();

}

class Dog implements Animal {

    public void sound() {
        System.out.println("Dog barks");
    }

}

public class Day8_6 {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
    }

}
