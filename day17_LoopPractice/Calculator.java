package day17_LoopPractice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println(" enter your first number");
        int input= scan.nextInt();

        System.out.println(" enter your second number");
        int input2= scan.nextInt();
       //+-
        System.out.println(" enter  a math operator");
       char ch= scan.next().charAt(0);

       while (!(ch=='+')|| !(ch=='+')){
            System.out.println("invalid operator");
            ch=scan.next().charAt(0);
        }



    }
}
