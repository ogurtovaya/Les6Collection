package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LesList {

    public static void main(String[] args) {

        java.util.List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(20);
        list.add(2,5);
        list.addAll(0,Arrays.asList(2,1,3));
        System.out.println(list);

        System.out.println(list.indexOf(4));
        System.out.println(list);

        list.sort(Comparator.reverseOrder());
        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);

        list.remove((Integer) 4);
        list.removeIf(x -> x == 2);
        System.out.println(list);

        list.removeIf(x -> x >= 2 && x <=5);

        System.out.println(list);

        list.set(1,2);
        System.out.println(list);





    }



}
