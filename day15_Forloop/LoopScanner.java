package day15_Forloop;

import java.util.Scanner;

public class LoopScanner {

    public static void main(String[] args) {
          int total= 0;
        Scanner scan= new Scanner(System.in);


        for (int i = 0; i < 5; i++) {

            System.out.println(" enter your number");
            total+=scan.nextInt();


        }
        scan.close();
        System.out.println("total = " + total);













    }
}
