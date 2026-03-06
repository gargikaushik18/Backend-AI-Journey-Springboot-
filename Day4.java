public class Day4 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        for (int i = 2; i <= 20; i = i + 2) {
            System.out.println(i);
        }
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }
        int k = 1;

        do {
            System.out.println(k);
            k++;
        } while (k <= 5);

        // increasing triangle
        for (int a = 0; a < 4; a++) {
            for (int b = 0; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // decreasing triangle
        for (int a = 3; a >= 0; a--) {
            for (int b = 0; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Right aligned Triangle
        for (int a = 0; a < 4; a++) {

            for (int b = 0; b < 3 - a; b++) {
                System.out.print(" ");
            }
            for (int b = 0; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Pyramid Pattern
        for (int a = 0; a < 4; a++) {

            for (int b = 0; b < 3 - a; b++) {
                System.out.print(" ");
            }
            for (int b = 0; b < (2 * a - 1); b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }
}