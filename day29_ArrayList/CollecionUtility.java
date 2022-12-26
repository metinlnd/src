package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Callable;

public class CollecionUtility {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        System.out.println("=============================================");

        ArrayList<Character>list1=new ArrayList<>();
        list1.addAll(Arrays.asList('A','B','C','D','E'));

        Collections.reverse(list1);
        System.out.println(list1);
        Collections.swap(list1, 3,4);
        System.out.println(list1);

int max= Collections.max(list1);
        System.out.println(max);


        ArrayList<Integer>list2=new ArrayList<>();
        list2.addAll(Arrays.asList(10,20,30,40,50,60));
        Collections.replaceAll(list2, 20,40);
        System.out.println(list2);


int fre= Collections.frequency(list2,20);
        System.out.println(fre);

int freV=Collections.frequency(list1, 'A');
        System.out.println(freV);









    }
}
