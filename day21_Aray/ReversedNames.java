package day21_Aray;

import java.util.Arrays;

public class ReversedNames {
    public static void main(String[] args) {

        int [] numbers= {10,20,30,40,50};

        int [] result= new int[numbers.length];

        for (int each : numbers) {

            for (int i = numbers.length - 1, j= 0; i >= 0; j++, i--) {

                result [j]=numbers[i];

            }




        }System.out.println(Arrays.toString(result));
























    }
}
