package day18_nestedLoop;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
     while (true) {

         System.out.println(" enter your number");
         int n = scan.nextInt();
         if (n % 2 == 0) {
             System.out.println(n + " is even even number");
         } else {
             System.out.println("odd number");
         }

         System.out.println(" woudyou like to enter another number");
         String num = scan.next().toLowerCase();
         while (!(num.equals("yes")||num.equals("no")))
         {System.out.println(" please re enter");
         num=scan.next();

         }

         if(num.equals("no")){break;  }




     }















    }
}
