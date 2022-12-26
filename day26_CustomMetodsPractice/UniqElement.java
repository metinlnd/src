package day26_CustomMetodsPractice;

import utilities.ArrayUtility;

import java.util.Arrays;

public class UniqElement {
    public static void main(String[] args) {

        double []array={1.2,4.6,7.8,};
       double [] unique= uniqueElement(array);
        System.out.println(Arrays.toString(unique));



    }




// returns the unique element of the array as new array
public static int[] uniqueElement(int[]array){

    int[] result= {};


    for (int each : array) {if(ArrayUtility.frequencyOfElement(array,each)==1)
    {result=ArrayUtility.addElement(result,each);};

    } return result;





}


    // returns the unique element of the array as new array
    public static double[] uniqueElement(double[]array){

        double[] result= {};


        for (double each : array) {if(ArrayUtility.frequencyOfElement(array,each)==1)
        {result=ArrayUtility.addElement(result,each);};

        } return result;





    }



    // returns the unique element of the array as new array
    public static char[] uniqueElement(char[]array){

        char[] result= {};


        for (char each : array) {if(ArrayUtility.frequencyOfElement(array,each)==1)
        {result=ArrayUtility.addElement(result,each);};

        } return result;}



// returns the unique element of the array as new array
        public static String[] uniqueElement(String[] array){

            String[] result= {};


            for (String each : array) {if(ArrayUtility.frequencyOfElement(array,each)==1)
            {result=ArrayUtility.addElement(result,each);};

            } return result;





        }



    }






