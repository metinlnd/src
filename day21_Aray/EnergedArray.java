package day21_Aray;

import java.util.Arrays;

public class EnergedArray {
    public static void main(String[] args) {


        String [] group1= {"fatma","aysa","metin","ali"};
        String[] group2 = {"osaman","ahmad","jamaes","david"};

        String [] mergedArry= new String[group1.length+group2.length];

   // String [] mergedarry= new String[group1.length+group2.length]
        int i= 0;


        for (String each : group1) {


           mergedArry[i++] = each ;

        }

        for (String each : group2) {

            mergedArry[i++] = each ;

        }


        System.out.println(Arrays.toString(mergedArry));

        System.out.println("=============");


        char [] ch1= {'a','b','c','d'};

        char [] ch2= {'e','f'};

        char [] merged= new char[ch1.length+ch2.length];
int i1= 0;
        for (char each : ch1) {
            merged[i1++]= each;

        }

        for (char each : ch2) {
            merged[i1++]= each;


        }
        System.out.println(Arrays.toString(merged));













    }
}
