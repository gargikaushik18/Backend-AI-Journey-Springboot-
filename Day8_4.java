class Person {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Day8_4 {
    public static void main(String[] args) {

        Person p = new Person();

        p.setName("Gargi");

        System.out.println(p.getName());
    }
}

// Encapsulation means hiding data and controlling access to it.
// Encapsulation Protect data using private variables + getters/setters.
// cannot check balance directly