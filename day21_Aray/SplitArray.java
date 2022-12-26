package day21_Aray;

import java.util.Arrays;

public class SplitArray {
    public static void main(String[] args) {




        String str= "I love learning java programing language";
     String[] som =  str.split("ea");
        System.out.println(Arrays.toString(som));

        System.out.println(" =======================");

        String email= "WoodenSPOON@GMAIL.COM";

       String[]arr= email.split("@");
        System.out.println(Arrays.toString(arr));


        System.out.println(" ======================================");

        String S= " Today is nice day. today is monday. today we learn java";
        String [] sente= S.split("\\.");

        System.out.println(Arrays.toString(sente));









    }
}
