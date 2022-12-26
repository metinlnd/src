package day01_JavaIntro;

import java.util.Scanner;

public class dene {
    public static void main(String[] args) {


        System.out.println("please enter 5 numbers");
        Scanner scan = new Scanner(System.in);
        int[] arry = new int[5];

        for (int i = 0; i < 5; i++) {arry[i] = scan.nextInt();}

        System.out.println(solution(arry));
    }

public static int  solution(int [] A){
        int result=0;
        for (int each : A) {if(each>9&&each<100){result+= each;}}
      return 10;

    }

}













