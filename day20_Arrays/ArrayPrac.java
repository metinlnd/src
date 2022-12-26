package day20_Arrays;

import java.util.Arrays;

public class ArrayPrac {
    public static void main(String[] args) {


        // store elements; 10203050

        int [] numbers= {10,20,50,70};

        System.out.println(Arrays.toString(numbers));
        System.out.println(" = ==============");
        //5 scores


        int[] score= new int[5];
        score[1]=10;
        score[score.length-1] =100;
        score[3]=75;
        score[0]=20;
        score[2]=15;

        System.out.println(Arrays.toString(score));






    }
}
