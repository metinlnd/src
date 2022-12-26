package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        System.out.println(list);

        int num=5;
        list.remove(num);
        System.out.println(list);
        System.out.println("=======");
        list.remove(list.add(10));
        System.out.println(list);
        System.out.println(list.lastIndexOf(12));
      int num1=  list.indexOf(12);

        System.out.println(num1);




    }
}
