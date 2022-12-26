package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMetods1 {
    public static void main(String[] args) {

        ArrayList<Integer> number= new ArrayList<>();
        number.add(10);// adds after last index of arraylist
        number.add(20);
        number.add(30);


number.add(2,23);

number.set(2, number.get(0));

        System.out.println("dddddddddddd");
      //  number.add(12,23);//Exception in thread "main"
        System.out.println(number);

        System.out.println(number.size());


        int lastindex=number.size()-1;
        System.out.println("lastindex="+ lastindex);


     int num1=   number.get(3);

        System.out.println(num1);

        System.out.println("=================");


        ArrayList<String>list=new ArrayList<>();
        list.add("java");
        list.add("pyhoton");
        list.add("C@");
        list.add("Ruby");

        list.set(2,"java");
        System.out.println(list.get(2));

    }
}
