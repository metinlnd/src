package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
     /*   Scanner input = new Scanner(System.in);
        System.out.println(" please enter integer number");
        int num1= input.nextInt();
        System.out.println(" enter decimel number");
        double num2 = input.nextDouble();
        System.out.println(num2*num1);*/


        Scanner items= new Scanner(System.in);
        System.out.println(" enter integer");

         int num1= items.nextInt();
        System.out.println(" enter decimel");
        double num2= items.nextDouble();
        System.out.println(" enter the name");
        String num3 =  items.next();
        System.out.println("multificaiton of"+""+num1*num2);
        System.out.println(" is that true or false");
 boolean num5= items.nextBoolean();
        System.out.println("num5 = " + num5);














    }








}
