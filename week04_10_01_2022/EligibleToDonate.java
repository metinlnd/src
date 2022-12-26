package week04_10_01_2022;

import java.util.Scanner;

public class EligibleToDonate {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("please enter your speed");
        int speed = input.nextInt();
        if(speed>80){
            System.out.println(" so fast");
        } else if (speed>=50) {
            System.out.println(" normal");


        }else {
            System.out.println(" speed up");
        }


    }

}
