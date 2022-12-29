package day42_exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeySWosdManualy {
    public static void main(String[] args) {

        System.out.println("enter your age");
        Scanner scan= new Scanner(System.in);
        int age= scan.nextInt();
        //if(age<0){
        //    System.err.println("invalid age");
        //    System.exit(1);}
        if(age<=20){


            throw  new InputMismatchException("age can not be negative:"+ age);


        }
        if(age>20){
            System.out.println("eliginlbe buy alcohol");
        }





    }
}
