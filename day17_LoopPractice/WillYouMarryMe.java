package day17_LoopPractice;

import java.util.Scanner;

public class WillYouMarryMe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" wILL YOU MARRY ME");
        String marry= scan.nextLine();

        while (!(marry.equalsIgnoreCase("yes")|| marry.equalsIgnoreCase("no")))
        {System.out.println(" invailid answer please enter yes or no");
            marry=scan.nextLine();}
        if (marry.equalsIgnoreCase("yes")){
            System.out.println(" congat");
        }else {System.out.println("goodbye");}


















    }


}
