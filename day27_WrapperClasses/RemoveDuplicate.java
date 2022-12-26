package day27_WrapperClasses;

import utilities.ArrayUtility;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {

        int [] a={1,2,3,1,2,3,1,2,3,4};

        int[] b= removeDuplicate(a);

        System.out.println(Arrays.toString(b));


        String [] ab={"java","java"};

        String [] abc=removeDuplicate(ab);
        System.out.println(Arrays.toString(abc));
    }






    
    //removes the duplicate from given array, returns the new array
    public static int[] removeDuplicate(int[]array){

        int[] result={};

        for (int each : array) {

            if(!ArrayUtility.contain(result,each))
            {result=ArrayUtility.addElement(result,each);}

        }

        return result;
    }


    //removes the duplicate from given array, returns the new array
    public static double[] removeDuplicate(double[]array){

        double[] result={};

        for (double each : array) {

            if(!ArrayUtility.contain(result,each))
            {result=ArrayUtility.addElement(result,each);}

        }

        return result;
    }


    //removes the duplicate from given array, returns the new array
    public static char[] removeDuplicate(char[]array){

        char[] result={};

        for (char each : array) {

            if(!ArrayUtility.contain(result,each))
            {result=ArrayUtility.addElement(result,each);}

        }

        return result;
    }

    //removes the duplicate from given array, returns the new array
    public static String[] removeDuplicate(String[]array){

        String[] result={};

        for (String each : array) {

            if(!ArrayUtility.contain(result,each))
            {result=ArrayUtility.addElement(result,each);}

        }

        return result;
    }













}
