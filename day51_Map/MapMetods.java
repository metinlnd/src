package day51_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMetods {
    public static void main(String[] args) {


        Map<String, Integer>student1=new HashMap<>();

        Map<String, Integer>student2= new TreeMap<>();//ascending order
        student1.put("mustafa",80);
        student1.put("mustafa",85);
        System.out.println(student1);
       // System.out.println(student1.get(85));

        student1.put("ali",76);
        System.out.println(student1.containsValue(76));


    }









}
