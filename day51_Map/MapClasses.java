package day51_Map;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

            //key     VALUE
        Map<Integer, String>map1=new HashMap<>();


        map1.put( null,"ahmet");
        map1.put(10, "ARTHUR");// key must be Uniqe
        map1.put(20,"Georgge");
        map1.put(3,"jack");
        map1.put(40,"emma");
        map1.put(5,"Isabella");
        map1.put(5,"ahmet");

        System.out.println(map1);

        Map<Integer, String>map2=new TreeMap<>();

        Map<Integer, String>map3=new LinkedHashMap<>();

        map3.put(10,"arthur");
        map3.put(20,"arthur");
        map3.put(30,"arthur");
        map3.put(null,"arthur");
        map3.put(10,null);
        System.out.println(map3);
        Map<Integer, String>map4=new Hashtable<>();
























    }
}
