import java.util.*;

public class questionTwo {
    public static void main(String[] args) {

        Integer[] arr={5,3,8,1,2};

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
    }
}
