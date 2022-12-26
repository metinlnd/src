package day21_Aray;

import java.util.Arrays;

public class ArrayUtilitey {
    public static void main(String[] args) {

        String[] student= {"Elif", "Osman", "Gunay", "ames", "Aaron","Daniel"};

        String[ ] earlyBirds= Arrays.copyOf(student,3);
        System.out.println(Arrays.toString(earlyBirds));

 int [] numbers={1,2,3,4,5,6,7,8,9};

  numbers=Arrays.copyOf(numbers,5);

        System.out.println(Arrays.toString(numbers));


        char[] ch1= {'a','b','c','d','e'};

        char[]ch2= Arrays.copyOfRange(ch1,3,6);//ending index exculuede always

        System.out.println(Arrays.toString(ch2));


        System.out.println(" = ===========================================");


        int [] scores= {10,20,30,40,50,60};

        int[] result= Arrays.copyOfRange(scores, 2,scores.length);
        System.out.println(Arrays.toString(result));







    }
}
