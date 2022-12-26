package day12_Scanner;

import java.util.Scanner;

public class ShippingAdress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter your full name");
        String name = input.nextLine();
        System.out.println(" enter your builg number");
        int num1= input.nextInt();
        input.nextLine();// before use it
        System.out.println(" enter city name");
        String name2 = input.nextLine();
        System.out.println(" enter apartment name");
        String name3 = input.nextLine();
        System.out.println(" enter the zip codde");
       int zip= input.nextInt();
        System.out.println("zip = " + zip);
input.close();

               System.out.println(name+name2+name3+num1);













    }


}
