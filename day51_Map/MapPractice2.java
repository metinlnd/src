package day51_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);
        Integer maxsalary=0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {

             if(entry.getValue()>maxsalary){maxsalary= entry.getValue();}





        }    System.out.println(maxsalary);
















    }
}
