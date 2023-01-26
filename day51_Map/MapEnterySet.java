package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapEnterySet {
    public static void main(String[] args) {
        Map<Integer, String> map1=new HashMap<>();
        map1.put(10, "ARTHUR");// key must be Uniqe
        map1.put(20,"Georgge");
        map1.put(3,"jack");
        map1.put(40,"emma");
        map1.put(5,"Isabella");
        map1.put(5,"ahmet");

        System.out.println(map1.keySet()+ "ddd");

        System.out.println(map1.values());
        for (String entry : map1.values()) {
            System.out.println(entry);}


        System.out.println(map1.entrySet());
        for (Map.Entry<Integer, String> integerStringEntry : map1.entrySet()) {

            System.out.println(integerStringEntry.getKey());

        }

    }






    }

