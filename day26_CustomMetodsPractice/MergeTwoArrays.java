package day26_CustomMetodsPractice;

import utilities.ArrayUtility;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int [] arr={1,2,3};
        int[] arr2={4,5,6};
      int[] merged=  merge(arr,arr2);
        System.out.println(Arrays.toString(merged));



        String [] a={"metin","usame"};
        String [] b= {"yilmaz"};

       String []c= ArrayUtility.merge(a,b);

        System.out.println(Arrays.toString(c));


    }

    // merge the given 2 arrays and returns to new array(first solutin)

    public static int[] merge(int[]arr1,int[]arry2){

       int [] result= {};


        for (int each : arr1) {result=ArrayUtility.addElement(result,each);}

        for (int each : arry2) {result=ArrayUtility.addElement(result,each);}

        return result;





    }
    // merge the given 2 arrays and returns to new array(first solutin)
    public static double[] merge(double[]arr1,double[]arry2){

        double [] result= {};


        for (double each : arr1) {result=ArrayUtility.addElement(result,each);}

        for (double each : arry2) {result=ArrayUtility.addElement(result,each);}

        return result;





    }
    // merge the given 2 arrays and returns to new array(first solutin)
    public static char[] merge(char[]arr1,char[]arry2){

        char [] result= {};


        for (char each : arr1) {result=ArrayUtility.addElement(result,each);}

        for (char each : arry2) {result=ArrayUtility.addElement(result,each);}

        return result;





    }
    // merge the given 2 arrays and returns to new array(first solutin)
    public static String [] merge(String[]arr1,String[]arry2){

        String [] result= {};


        for (String each : arr1) {result=ArrayUtility.addElement(result,each);}

        for (String each : arry2) {result=ArrayUtility.addElement(result,each);}

        return result;





    }

    // merge the given 2 arrays and returns to new array(second solutin)
    public static int[] merged2ways(int[]arry1, int[]arry2){

        int [] result= new int[arry1.length+ arry2.length];

        int i= 0;

        for (int each : arry1) { result[i++]= each;}
        for (int each : arry2) { result[i++]= each;}

        return result;



        }

        }



