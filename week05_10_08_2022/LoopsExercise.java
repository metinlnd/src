package week05_10_08_2022;

import java.util.Scanner;

public class LoopsExercise {
    public static void main(String[] args) {


        String str = " metin";
        Scanner scan = new Scanner(System.in);
        int guess = 0;


        while (true) {

            System.out.println("please enter a password");

            String entry = scan.nextLine();

            if (entry.equals(str)) {
                System.out.println("welcome");
                break;
            }


            guess++;


            if (guess == 3) {
                System.out.println("sorry");
                break;
            }


        }
    }
}