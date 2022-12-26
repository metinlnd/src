package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqElement {
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));

        ArrayList<Integer>Uniq= new ArrayList<>();
        for (Integer each : list) {int frequency= Collections.frequency(list,each);
            if(frequency==1){Uniq.add(each);}


        }System.out.println(Uniq);

        System.out.println("=====================d===================================");

        ArrayList<Integer>list1= new ArrayList<>();
        list1.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));

        ArrayList<Integer>Uniq1= new ArrayList<>(list1);
        Uniq1.removeIf(p->Collections.frequency(list1,p)>1 );

        System.out.println(Uniq1);

    }
}
