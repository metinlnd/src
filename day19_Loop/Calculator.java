package day19_Loop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println(" enter a number");

        int num= scanner.nextInt();

        System.out.println(" enter the maht opartaor");

        char ch= scanner.next().charAt(0);

        if (!(ch=='+')|| (ch== '-')||(ch=='*')||(ch=='/')) {
             System.out.println("invalikd operator");
            // System.exit(0);

         }


        System.err.println(" eneter second number");

        int num2= scanner.nextInt();









    }
}
