package day21_Aray;

public class ForEachLoopSum {
    public static void main(String[] args) {

        int [] numbers= {10,20,30,40,50};

        double sum= 0;
        for (int each : numbers) { sum+=each;


        } System.out.println(sum/numbers.length);



    }
}
