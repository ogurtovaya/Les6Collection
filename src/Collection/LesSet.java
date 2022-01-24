package Collection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LesSet {
    public static void main(String[] args) {

        Set<Integer> setA = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        Set<Integer> setB = new HashSet<>(Arrays.asList(2,4,6,8,10));
        System.out.println(setA);
        System.out.println(setB);

        setA.addAll(setB);
        System.out.println(setA);

        setA.retainAll(setB);
        System.out.println(setA);



    }
}
