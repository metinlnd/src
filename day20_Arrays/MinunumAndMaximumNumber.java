package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinunumAndMaximumNumber {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);


int number[]= new int[10];

        for (int i = 0; i < number.length; i++) {
            System.out.println(" enter a number");

            number[i]=scan.nextInt();}

        int max= number[0];
        int min= number[0];

        for (int i = 0; i < number.length; i++) {

            if (number[i]> max) { max= number[i];};
            if(number[i]<min){min=number[i];};

        } System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println(Arrays.toString(number));


    }
}
