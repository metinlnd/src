package utilities;

import java.util.Arrays;

public class ArrayUtility {

    // prints each integer of an integer array in separate lines

    public static void printEachElement(int [] array){

        for (int each : array) {System.out.println(each);}}

// prints each double of a double array in separate lines
    public static void printEachElement(double [] array){

        for (double each : array) {System.out.println(each);}}



   // prints each char of a char array in separate lines
    public static void printEachElement(char [] array){

        for (char each : array) {System.out.println(each);}}




   // prints each String of a String array in separate lines
    public static void printEachElement(String [] array){

        for (String each : array) {System.out.println(each);}}



    // returns the maximum number for integer array

    public static int max(int [] numbers){

        Arrays.sort(numbers);

        return numbers[numbers.length-1];    }


    // returns the maximum number for double array

    public static double max(double [] numbers){

        Arrays.sort(numbers);

        return numbers[numbers.length-1];    }

  // returns the minumum number for double array

   public static double min(double [] numbers){
        Arrays.sort(numbers);

        return numbers[0];    }

    // returns the min number for integer array
    public static int min(int [] numbers){

        Arrays.sort(numbers);

        return numbers[0];    }


    // check if the integer contain in the given array . retuns to boolean{contains metod create}

public static boolean contain(int [] array, int element){

     boolean result= false;  //{1234567}  9

    for (int each : array) {

        if(each==element){result=true;}

    }   return result;}


    // check if the double contain in the given array . retuns to boolean{contains metod create}

    public static boolean contain(double [] array, double element){

        boolean result= false;

        for (double each : array) {

            if(each==element){result=true;}

        }   return result;}


        // check if the char contain in the given array . retuns to boolean{contains metod create}

        public static boolean contain (char [] array, char element){

            boolean result= false;

            for (char each : array) {

                if(each==element){result=true;}

            }   return result;}

            // check if the String contain in the given array . retuns to boolean{contains metod create}

            public static boolean contain (String[] array, String element){

                boolean result= false;  //{1234567}  9

                for (String each : array) {

                    if(each.equals(element)){result=true;}

                }   return result;}



// add given element to array . return a new array.

    public static int[] addElement(int[] array, int element){
        int [] result = new int[array.length+1];


        int i= 0;

        for (int each : array) { result[i++]=each;}

        result[i]= element;
        return result;

    }
    // add given element to array . return a new array.
    public  static double[]addElement(double[] array, double element){

        double [] result = new double[array.length+1];


        int i= 0;

        for (double each : array) { result[i++]=each;}

        result[i]= element;
        return result;





    }


    // add given element to array . return a new array.
    public  static  char[] addElement(char[] array, char element ){

        char [] result = new char [array.length+1];


        int i= 0;

        for (char each : array) { result[i++]=each;}

        result[result.length-1]= element;
        return result;


    }
    // add given element to array . return a new array.
    public  static  String[] addElement(String[] array, String element ){

        String [] result = new String[array.length+1];


        int i= 0;

        for (String each : array) { result[i++]=each;}

        result[result.length-1]= element;
        return result;


    }



    //returns the frequency of the given element from the given array.
    public static int frequencyOfElement(int[] array, int element){ //{1,2,3,1,3,4}{1}

        int count = 0;
        for (int each : array) { if(each==element){count++;}

        } return count;

    }

    //returns the frequency of the given element from the given array.
    public static int frequencyOfElement(double[] array, double element){ //{1,2,3,1,3,4}{1}

        int count = 0;
        for (double each : array) { if(each==element){count++;}

        } return count;

    }

    //returns the frequency of the given element from the given array.
    public static int frequencyOfElement(char[] array, char element){ //{1,2,3,1,3,4}{1}

        int count = 0;
        for (char each : array) { if(each==element){count++;}

        } return  count;

    }

    //returns the frequency of the given element from the given array.
    public static int frequencyOfElement(String[] array, String element){

        int count = 0;
        for (String each : array) { if(each.equalsIgnoreCase(element)){count++;}

        } return count;

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



    public static int [] reverse(int [] array){

        int [] result= new int[array.length];

        for (int i = array.length-1, j=0;i >=0 ; i--,j++) {


            result[j] =array[i];

        }return result;



    }

    public static double [] reverse(double [] array){

        double [] result= new double[array.length];

        for (int i = array.length-1, j=0;i >=0 ; i--,j++) {


            result[j] =array[i];

        }return result;



    }


    public static char [] reverse(char [] array){

        char [] result= new char[array.length];

        for (int i = array.length-1, j=0;i >=0 ; i--,j++) {


            result[j] =array[i];

        }return result;



    }


    public static String [] reverse(String [] array){

        String [] result= new String[array.length];

        for (int i = array.length-1, j=0;i >=0 ; i--,j++) {


            result[j] =array[i];

        }return result;



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



    // replaces all the matching old values of the array with the new value

    public static int[] replaceAll( int[]array, int oldValue, int newValue){

        for (int i = 0; i < array.length; i++) {


            if(array[i]==oldValue){array[i]=newValue;}

        }return array;


    }

    // replaces all the matching old values of the array with the new value

    public static double[] replaceAll( double[]array, double oldValue, double newValue){

        for (int i = 0; i < array.length; i++) {if(array[i]==oldValue){array[i]=newValue;}

        }return array;

    }

// replaces all the matching old values of the array with the new value

    public static char[] replaceAll( char[]array, char oldValue, char newValue){

        for (int i = 0; i < array.length; i++) {if(array[i]==oldValue){array[i]=newValue;}

        }return array;

    }

// replaces all the matching old values of the array with the new value

    public static String[] replaceAll( String[]array, String oldValue, String newValue){

        for (int i = 0; i < array.length; i++) {if(array[i].equals(oldValue)){array[i]=newValue;}

        }return array;

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










