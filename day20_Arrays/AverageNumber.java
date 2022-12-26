package day20_Arrays;

public class AverageNumber {
    public static void main(String[] args) {

        int [] number={10,20,30,40,50,60,70,80,90};

        double sum= 0;

        for (int i = 0; i < number.length; i++) {

            sum+=number[i];


        } double averagenumber= sum/number.length;

        System.out.println("averagenumber = " + averagenumber);
















    }
}
