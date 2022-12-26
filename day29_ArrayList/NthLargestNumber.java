package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,5,5,6,7,7));



         int n= 3;

        System.out.println("==================");
        //list.removeIf(each->Collections.max(list)==each);
        System.out.println(list);
        for (int i = 1; i <n ; i++) {

            list.removeIf(each->each==Collections.max(list));
            System.out.println(list);
        }
        System.out.println("==============");

        int max= Collections.max(list);
        System.out.println(max);















    }
}
