package Collection;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);

 //       for (int i = 0; i < arrayList.size(); i++) {
 //            System.out.println(arrayList.get(i));
//}
//        for (Integer x:arrayList) {
//            System.out.println(x);
//        }
        arrayList.remove(5);
        System.out.println(arrayList);




    }
}
