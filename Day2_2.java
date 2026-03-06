import java.util.Scanner;

public class Day2_2 {
    public static void main(String args[]) {
        Scanner sys = new Scanner(System.in);
        System.out.println("a is : ");
        int a = sys.nextInt();
        System.out.println("b is : ");
        int b = sys.nextInt();
        System.out.println(a + b);
        double f = (a * (9.0 / 5) + 32);
        System.out.println("f is : " + f );
        sys.close();
    }
}
// Primitive Non-Primitive
// Stores actual value Stores reference/address
// Built-in datatypes Createdby programmer or Java library
// Fixed size Size can vary
// No methods Methods canbe used
// Example:int,char Example:String,Array,Class
