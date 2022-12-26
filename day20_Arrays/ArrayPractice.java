package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

            char [] letters= new char[26];
           /*
            letters[0] ='a';
            letters[1] ='b';*/


       // for (char i = 'A',j=0 ; i <='Z' && j<letters.length ; i++,j++) {

          //  letters[j]=i;}

        for (int i = 0, j= 'A'; i <letters.length; i++,j++) {

        letters[i]=(char) j;


        }

        System.out.println(Arrays.toString(letters));










    }
}
