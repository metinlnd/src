package day26_CustomMetodsPractice;

import utilities.ArrayUtility;

public class ReverseClass2 {


    public static int[] reverse(int[]array){

        int [] result= {};

        for (int i = array.length - 1; i >= 0; i--) {

         result =  ArrayUtility.addElement(result,array[i]);


        } return result;




    }



}
