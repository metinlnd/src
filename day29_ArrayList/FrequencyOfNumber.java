package day29_ArrayList;

import java.util.ArrayList;

public class FrequencyOfNumber {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);

        System.out.println(list);

        int frequency=0;
        for (Integer element : list) { if(element==1){frequency++;}

        } System.out.println(frequency);






    }
}
