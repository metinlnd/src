package day15_Forloop;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println(" enter your string");
        String str= scan.next();
        scan.close();
        
        int length= str.length()-1;
        String reverse= "";


        for (int i = length; i >=0 ; i--) {reverse +=str.charAt(i);
            
        }

        System.out.println("reverse = " + reverse);



    }
}
