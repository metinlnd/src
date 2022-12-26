package day12_Scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter your name");
       // boolean num1= input.nextBoolean();
        String name= input.next();
        System.out.println(" enter national insuran number");
        String nationalInursnenumber= input.nextLine();
        System.out.println(" enter the school name");
        String schoolname= input.nextLine();

        System.out.println(nationalInursnenumber + name);



















    }
}
