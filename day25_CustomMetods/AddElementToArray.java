package day25_CustomMetods;

import java.util.Arrays;

public class AddElementToArray {

    public static void main(String[] args) {

        int [] arr={1,2,3,4};
        arr= addInteger( arr ,5);
        System.out.println(Arrays.toString(arr));


        double [] doublearr= {1.4,4.5};
        doublearr= addDouble(doublearr,5.6);
        System.out.println(Arrays.toString(doublearr));




        char[] chararray={'s','t'   };

        chararray= addChar(chararray,'h');
        System.out.println(Arrays.toString(chararray));




        String [] stringarray={"metin","usame"};


        stringarray= addString(stringarray,"mahir");
        System.out.println(Arrays.toString(stringarray));





    }

public static int[] addInteger(int[] array, int element){
    int [] result = new int[array.length+1];


    int i= 0;

    for (int each : array) { result[i++]=each;}

    result[i]= element;
    return result;

}

public  static double[]addDouble(double[] array, double element){

   double [] result = new double[array.length+1];


    int i= 0;

    for (double each : array) { result[i++]=each;}

    result[i]= element;
    return result;





}



public  static  char[] addChar(char[] array, char element ){

    char [] result = new char [array.length+1];


    int i= 0;

    for (char each : array) { result[i++]=each;}

    result[result.length-1]= element;
    return result;


}

    public  static  String[] addString(String[] array, String element ){

        String [] result = new String[array.length+1];


        int i= 0;

        for (String each : array) { result[i++]=each;}

        result[result.length-1]= element;
        return result;


    }




     }

