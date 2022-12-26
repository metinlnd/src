package day20_Arrays;

public class MaxNumberOfArray {
    public static void main(String[] args) {

        int [] numbers= {10,20,30,40,50};

        int max= numbers[0];

      //  for (int i = 0; i < numbers.length; i++) {}fori
       // for (int i = numbers.length - 1; i >= 0; i--) {//forr}

        for (int i = 0; i < numbers.length; i++) {


            if(numbers[i]>max){max=numbers[i];}

        } System.out.println("max = " + max);










    }
}
