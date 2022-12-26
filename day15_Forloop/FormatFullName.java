package day15_Forloop;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {

        System.out.println("please enter your firs name");
        String firstname= new Scanner(System.in).next();
        System.out.println(" enter yor last name");
        String lastname= new Scanner(System.in).next();

        firstname = firstname.substring(0,1).toUpperCase()+firstname.substring(1).toLowerCase();

        firstname = (""+firstname.charAt(0)).toUpperCase()+firstname.substring(1).toLowerCase();
        lastname = lastname.substring(0,1).toUpperCase()+firstname.substring(1).toLowerCase();
        String fullname= firstname+lastname;



        System.out.println("firstname = " + firstname);













    }
}
