import java.util.*;

public class questionTwo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr)
            map.put(num, map.getOrDefault(num, 0) + 1);

        int maxFreq = 0, element = 0;

        for (int key : map.keySet()) {
            if (map.get(key) > maxFreq) {
                maxFreq = map.get(key);
                element = key;
            }
        }

        System.out.println("Element = " + element);
        System.out.println("Frequency = " + maxFreq);
    }
}