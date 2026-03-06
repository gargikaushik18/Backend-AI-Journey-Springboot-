public class Day5 {
    // increasing triangle

    public static void main(String[] args) {
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
