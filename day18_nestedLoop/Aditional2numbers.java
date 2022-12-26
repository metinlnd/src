package day18_nestedLoop;

import java.util.Scanner;

public class Aditional2numbers {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);


       while (true) {

           System.out.println(" enter your first number");
           int num1 = scan.nextInt();

           System.out.println(" enter your second number");
           int num2 = scan.nextInt();

           System.out.println("addition " + (num1 + num2));

           System.out.println(" woudl you like to continuw");

           String answer= scan.next().toLowerCase();

           while (!(answer.equals("yes")||(answer.equals("no"))))
           {System.out.println(" invalid entery");
               System.out.println(" would you like to continu");
               answer=scan.next().toLowerCase();}



           if(answer.equals("no")){break;}





       }














    }
}
