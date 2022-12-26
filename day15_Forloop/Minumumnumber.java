package day15_Forloop;

import java.util.Scanner;

public class Minumumnumber {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
         int num= 2147483647;
        for (int i = 0; i < 5; i++) {
            System.out.println(" enter your number");
            int min= scan.nextInt();

            if(num<min){ min=num;}





        }

        System.out.println(num);
    }
}
