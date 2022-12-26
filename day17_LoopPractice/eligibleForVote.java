package day17_LoopPractice;

import java.util.Scanner;

public class eligibleForVote {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        System.out.println("enter your age");
        int age= scan.nextInt();// valid age 1 to120
        while ( age<0||age>125){System.out.println(" invalid age please reenter age");

        age=scan.nextInt();}

        System.out.println(" are you US citizen");
        String citizinship= scan.next().toLowerCase();

        while (!(citizinship.equals("yes")||citizinship.equals("no"))){
            System.out.println(" please re enter your citizship");
            citizinship=scan.next().toLowerCase();
        }



















    }
}
