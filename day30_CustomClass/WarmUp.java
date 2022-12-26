package day30_CustomClass;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUp {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        Collections.swap(list, 0, list.size() - 1);
        System.out.println(list);

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        System.out.println("============================================++++================");


        ArrayList<Integer> list1 = new ArrayList<>();

        list1.addAll(Arrays.asList(3, 4, 5, 8, 2, 7, 3, 6, 0, 0, 4, 9, 0));
       int size = list1.size();
        list1.removeAll(Arrays.asList(0));
        System.out.println(list1);

      int newsize= list1.size();
      int totalnumberZero=size-newsize;
        for (int i = 0; i <totalnumberZero ; i++) {

            list1.add(0);

        }
        System.out.println(list1);
    }
}