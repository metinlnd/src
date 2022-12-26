package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println(list);

list.removeAll(Arrays.asList(3,5,6,9));
        System.out.println(list);


        System.out.println("=============");

ArrayList<Integer>list1=new ArrayList<>();

list1.addAll(Arrays.asList(1,2,3,4,5,6,6,7,8,9));
list1.retainAll(Arrays.asList(1,2,3,56));
        System.out.println(list1);

        System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=");

        ArrayList<String>jobtitles=new ArrayList<>();

        jobtitles.addAll(Arrays.asList("qa","sdet","developer","ba","ba","scrum master"));

        jobtitles.retainAll(Arrays.asList("qa","sdet"));
        System.out.println(jobtitles);


        System.out.println("==0=9=0=09==0=0090=0900=03030=30=3030=303=030=3030==");

        ArrayList<Integer>list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        boolean e1= list2.contains(8);
        boolean e2= list2.contains(2)&&list2.contains(3);
        System.out.println(e2);
        System.out.println(e1);

boolean e3= list2.containsAll(Arrays.asList(2,3,4,5));
        System.out.println(e3);


        boolean e4= list2.containsAll(Arrays.asList(2,3,4,5,99));
        System.out.println(e4);


        System.out.println("==================3=============================");


        String[] names={"metin","useme","yilmaz"};
        ArrayList<String>namelist=new ArrayList<>(Arrays.asList(names));

       // namelist.addAll(Arrays.asList(names));
        System.out.println(namelist);

        System.out.println("===================================6====================");

       Integer[] arr={1,2,3,4,5};

        ArrayList<Integer>numbers=new ArrayList<>(Arrays.asList(arr));
        System.out.println(numbers);












    }

    public static ArrayList<Integer>convertArraytoArrayList(int[]array){
        ArrayList<Integer>list=new ArrayList<>();
        for (int each:array) {list.add(each);}

        return list;


    }

}
