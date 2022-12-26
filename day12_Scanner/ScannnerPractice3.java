package day12_Scanner;

import java.util.Scanner;

public class ScannnerPractice3 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println(" enter the age");

        int age = input.nextInt();// if you are using nettline methot after any you must clear the enter key.
        input.nextLine();

        System.out.println(" enter the name");

        String name = input.nextLine();

input.close();














    }
}
