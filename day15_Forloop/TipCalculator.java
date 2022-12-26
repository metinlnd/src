package day15_Forloop;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println(" split or not split(yes or/no");

        String yesorno= input.next().toLowerCase();


        System.out.println(" enter the number of the people");
        int numberofthepeople= input.nextInt();


        System.out.println(" entr the check amoount");
        double checkamount= input.nextDouble();


        System.out.println("how was the qualtiy");
        String quatlit= input.next().toLowerCase();


        double tiprate= ( quatlit.equals("excellent"))? 0.25 :(quatlit.equals("good"))? 0.2 :(quatlit.equals("fair"))? 0.1:0.001;



        double totaltip = checkamount*tiprate;
        System.out.println(totaltip );







    }
}
