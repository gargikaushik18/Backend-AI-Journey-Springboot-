class Student {
    String name;
    int age;
    int friends;

    Student(int n) {
        friends = n;
    }

    void display() {
        System.out.println(name + " " + age);
        System.out.println(friends);
    }
}

public class Day8_1 {
    public static void main(String args[]) {
        Student s1 = new Student(2);
        s1.name = "Gargi";
        s1.age = 21;
        s1.display();
    }
}

// classes & object ->done
// A class is a blueprint (template) to create objects.
// An object is an instance of a class.
// constructor ->done

// car-class
// bmw,audi- object