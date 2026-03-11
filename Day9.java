import java.util.ArrayList;

public class Day9 {
    public static void main(String args[]) {
        ArrayList<String> nums = new ArrayList<>();
        nums.add("Gargi");
        nums.add("Kaushik");
        nums.add("hieee");
        int n = nums.size();
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            System.out.print(nums.get(i) + " ");
        }
        System.out.println();
        nums.set(0, "heyyy");
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");
        }
        System.out.println();
        nums.remove(1);
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");
        }
        System.out.println();
        nums.clear();

        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");
        }
    }
}
