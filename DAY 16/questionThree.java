import java.util.*;

public class questionThree {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 8, 9};
        int target = 13;

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(target - num)) {
                System.out.println((target - num) + " " + num);
                return;
            }
            set.add(num);
        }

        System.out.println("No Pair Found");
    }
}