package day15_Forloop;

import java.util.Scanner;

public class LongesString {
    public static void main(String[] args) {
        System.out.println(" eneter yur firs stirng");
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();



        System.out.println(" enter yhor second stirng");

        Scanner input1 = new Scanner(System.in);
        String str3 = input1.nextLine();


        if(str1.length()>str3.length()){System.out.println("str1 = " + str1);}
        else if (str3.length()>str1.length()) {System.out.println("str3 = " + str3);}
        else {System.out.println(" both are same");}


    }
}
