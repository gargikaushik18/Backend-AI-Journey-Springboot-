import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Numbers are:");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
        int sum = 0;
        System.out.println("Sum is :");
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        System.out.println("Largest Number is:");
        int largi = arr[0];
        for (int i = 1; i < 5; i++) {
            if (arr[i] > largi) {
                largi = arr[i];
            }
        }
        System.out.println(largi);
        sc.close();
    }

}

// An array is a collection of multiple values stored in one variable.
// Backend uses arrays for

// storing API data
// storing database results
// processing user inputs
// handling JSON data