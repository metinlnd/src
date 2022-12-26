package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);
        list.add(30);


        ArrayList<Integer>result= new ArrayList<>();//10,20,30

        for (Integer each:list) {if(result.contains(each)){continue;}

            result.add(each);

       }System.out.println(result);


        System.out.println("--------------------------");

        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(10);
        list1.add(10);
        list1.add(10);
        list1.add(10);

        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(10);
        list2.add(10);
        list2.add(10);
        list2.add(10);


        System.out.println(list2==list1);//false because its new object in the memomroy. there are not same.


boolean t5= list1.equals(list2);
        System.out.println(t5);

        System.out.println("===============================================");
list1.clear();

        boolean te=list1.isEmpty();
        System.out.println(te);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=]-=-=");

ArrayList<Integer>list4=new ArrayList<>();
list4.addAll(Arrays.asList(1,2,3,4,4,5,4,3));

       System.out.println(list4);




    }



    }

