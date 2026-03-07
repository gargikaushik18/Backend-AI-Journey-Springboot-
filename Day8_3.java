class MathUtil {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Day8_3 {
    public static void main(String[] args) {

        MathUtil m = new MathUtil();

        System.out.println(m.add(2, 3));
        System.out.println(m.add(2, 3, 4));
    }
}
// Polymorphism- Same method name,different behavior.

// Compile time - creates overloading
// Runtime - creates overriding

// payment system- upi,credit,cash