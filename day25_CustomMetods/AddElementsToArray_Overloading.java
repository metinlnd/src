package day25_CustomMetods;

import java.util.Arrays;

public class AddElementsToArray_Overloading {

    public static void main(String[] args) {

        int [] num={1,2};
        char[] chars={'a','b','c'};

        String[] names= {"metin","yilmaz"};


     String[] names2=   addElement(names,"sd");
        System.out.println(Arrays.toString(names2));




    }




    public static int[] addElement(int[] array, int element){
        int [] result = new int[array.length+1];


        int i= 0;

        for (int each : array) { result[i++]=each;}

        result[i]= element;
        return result;

    }

    public  static double[]addElement(double[] array, double element){

        double [] result = new double[array.length+1];


        int i= 0;

        for (double each : array) { result[i++]=each;}

        result[i]= element;
        return result;





    }



    public  static  char[] addElement(char[] array, char element ){

        char [] result = new char [array.length+1];


        int i= 0;

        for (char each : array) { result[i++]=each;}

        result[result.length-1]= element;
        return result;


    }

    public  static  String[] addElement(String[] array, String element ){

        String [] result = new String[array.length+1];


        int i= 0;

        for (String each : array) { result[i++]=each;}

        result[result.length-1]= element;
        return result;


    }



}
