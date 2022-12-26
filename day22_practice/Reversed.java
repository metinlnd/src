package day22_practice;

import java.util.Arrays;

public class Reversed {
    public static void main(String[] args) {
        String sentence=" ali ahmet metin usame yiolmaz";
        String[] nw= sentence.split(" ");
        System.out.println(Arrays.toString(nw));


             String  reverserd="";

            for (int i = nw.length-1; i >=0 ; i--) {

               reverserd+= nw[i];


            } System.out.println("reverserd = " + reverserd);






    }
}
