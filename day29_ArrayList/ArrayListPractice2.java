package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {


        ArrayList<String>list=new ArrayList<>();

        list.addAll(Arrays.asList("ahmet", "david", "jimmiy", "metin"));


        list.retainAll(Arrays.asList("ahmet","david"));

        System.out.println(list);

        System.out.println("===================");

String[] names={"metin","usma","david","hasan","beril"};

ArrayList<String>list1=new ArrayList<>(Arrays.asList(names));
list1.removeIf(each->each.charAt(0)=='m');

        System.out.println(list1);

       names= list1.toArray(new String[0]);


        System.out.println(Arrays.toString(names));


    }
}
