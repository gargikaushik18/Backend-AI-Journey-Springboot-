import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in );

        System.out.println("Enter your name:") ;
        String name = sc.nextLine();

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        System.out.println("Enter your branch:");
        String branch = sc.nextLine();

        System.out.println("Hi " + name + ", welcome to Backend + AI journey ");
        System.out.println("Your branch is: " + branch);

        sc.close();
    }
}
