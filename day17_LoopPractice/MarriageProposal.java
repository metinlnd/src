package day17_LoopPractice;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println(" will you marry");
        String ans= scan.next().toLowerCase();

        while (!(ans.equals("yes")||ans.equals("no"))){
            System.out.println(" invalid");
            System.out.println(" will you marry me");ans=scan.next().toLowerCase();}

        if (ans.equals("yes")){System.out.println(" congat");}
        if(ans.equals("no")){System.out.println(" goodbye");}













    }
}
