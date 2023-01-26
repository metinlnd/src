package day51_Map;

import java.util.*;

public class MapIterations {
    public static void main(String[] args) {


        Map<String, Integer>students= new HashMap<>();
        students.put("aygun",50);
        students.put("ali",45);
        students.put("osamn",78);
        students.put("jack",90);
        students.put("ahmet",88);
 int maxcore=0;

        for (Integer each : students.values()) {

            if(each>maxcore){

                maxcore=each;
            }



        } System.out.println(maxcore);

        Map<String, Integer>earlybird=new HashMap<>();
        System.out.println("===================");
        System.out.println(students.keySet());
        for (String each : students.keySet()) {

            Integer value= students.get(each);




          // ArrayList<Integer>list2= new ArrayList<>(value1);

            System.out.println("========false======");
            if(value>78){
                System.out.println(each+"osmaan olmali");
            }


        }





        Set<String>keys=students.keySet();
        for (String each : keys) {
            System.out.println(each);




        }


        students.replace("ali",45);


        System.out.println(students.keySet());


        System.out.println("-------------------");










    }
}
