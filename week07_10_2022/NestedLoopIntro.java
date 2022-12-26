package week07_10_2022;

import java.util.Random;
import java.util.Scanner;

public class NestedLoopIntro {
    public static void main(String[] args) {

        Random random=new Random();
        int hiddennumber= random.nextInt(10)+1;



        Scanner scanner= new Scanner(System.in);
        boolean flag= true;

        do {System.out.println(" enter the number");
            int searchedNumber= scanner.nextInt();
            if (searchedNumber==hiddennumber){
                System.out.println(" so you find the number");

                flag=false;
            }else {
                System.out.println(" try again");
            }
        }while (flag);






    }

}







