package day20_Arrays;

import java.util.Arrays;

public class ArrayDates {
    public static void main(String[] args) {


        String [] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
// index                    0         1         2           3          4          5        6
        System.out.println(Arrays.toString(days));

        int number= 0;
        if(number<0|| number>=7){
            System.err.println("invalid number");
            System.exit(0);
        }

        System.out.println(days [number]);





    }
}
