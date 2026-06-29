import java.util.*;

public class questionTwo {
    public static void main(String[] args) {

        int[] a={1,2,3,4};
        int[] b={3,4,5,6};

        LinkedHashSet<Integer> set=new LinkedHashSet<>();

        for(int num:a)
            set.add(num);

        for(int num:b)
            set.add(num);

        System.out.println(set);
    }
}