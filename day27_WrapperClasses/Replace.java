package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};

        String[] str1 = {"metin ", "usame", "yilmaz"};

        String[] str2 = replace(str1, 0, "mahir");

        System.out.println(Arrays.toString(str2));


        int[] b = replace(a, 2, 100);
        System.out.println(Arrays.toString(b));

    int [] ar=  replaced(a,123,2);
        System.out.println(Arrays.toString(ar));
    }





    public static int [] replaced (int [] arryi, int elemente, int indexi){

        if(indexi<0|| indexi>arryi.length){
            System.out.println("invalid");
        }


        arryi[indexi]= elemente;

        return arryi;




    }




















    public static int[] replace(int[] array,int index, int newElement){

      if(index<0||index>array.length-1){
          System.err.println("invalid index number");
          System.exit(0);

      }

        array[index]=newElement;
      return array;




    }

    public static double[] replace(double[] array,int index, double newElement){

        if(index<0||index>array.length-1){
            System.err.println("invalid index number");
            System.exit(0);}

        array[index]=newElement;
        return array;


    }



    public static char[] replace(char[] array,int index, char newElement){

        if(index<0||index>array.length-1){
            System.err.println("invalid index number");
            System.exit(0);}

        array[index]=newElement;
        return array;


    }


    public static String[] replace(String[] array,int index, String newElement){

        if(index<0||index>array.length-1){
            System.err.println("invalid index number");
            System.exit(0);}

        array[index]=newElement;
        return array;


    }









}
