package day26_CustomMetodsPractice;

import java.util.Arrays;

public class RemoveElements {
    public static void main(String[] args) {

        int[] array={100,200,300,400};
     int []arry1=   removeElement(array,2);

        System.out.println(Arrays.toString(arry1));
    }



    public static int[] removeElement( int[] array, int index){

        if(index<0||index>array.length-1){
            System.err.println("invalid index");

            System.exit(0);
        }


        int [] result= new int[array.length-1];

        int j=0;

        for (int i=0; i<array.length; i++) {

            if(i==index){
                continue;
            }
            result[j++]=array[i];


        }return result ;




    }



    public static double[] removeElement( double[] array, int index){

        if(index<0||index>array.length-1){
            System.err.println("invalid index");

            System.exit(0);
        }


        double [] result= new double [array.length-1];

        int j=0;

        for (int i=0; i<array.length; i++) {

            if(i==index){
                continue;
            }
            result[j++]=array[i];


        }return result ;




    }


    public static char[] removeElement( char[] array, int index){

        if(index<0||index>array.length-1){
            System.err.println("invalid index");

            System.exit(0);
        }


        char [] result= new char[array.length-1];

        int j=0;

        for (int i=0; i<array.length; i++) {

            if(i==index){
                continue;
            }
            result[j++]=array[i];


        }return result ;




    }


    public static String[] removeElement(String[] array, int index){

        if(index<0||index>array.length-1){
            System.err.println("invalid index");

            System.exit(0);
        }


        String [] result= new String[array.length-1];

        int j=0;

        for (int i=0; i<array.length; i++) {

            if(i==index){
                continue;
            }
            result[j++]=array[i];


        }return result ;




    }


}
