package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println(" how many times do you want to enter");

        int length= scan.nextInt();

        int[] number= new int[length];
        if(length<0){System.out.println(" invalid number");System.exit(0);}

        for (int i = 0; i < length; i++) {

            System.out.println(" enter a number " );

           number[i]= scan.nextInt();}
        System.out.println(Arrays.toString(number));
        scan.close();










    }
}
