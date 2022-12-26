package day12_Scanner;


import java.util.Scanner;

public class ScannerPractice1 {

   /* public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println(" enter the number 1 ~7");
        int num1 = input.nextInt();
         String result ="";
        if(num1>=1&&num1<=7){

            switch (num1) {
                case 1: result="Monday";
                break;
                case 2:result="tuesday";
                break;
                case 3:result="wed";
                break;
                case 4:result="thur";
                break;
                case 5:result="friday";
                break;
                case 6:result="sat";
                break;
                default:result="sunday";


            }







        }else{System.out.println(" invailid");}


        System.out.println(result);*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" enter the number");
        int num1= input.nextInt();

        String result = "";

        if(num1>=1 && num1<=6){

         result=   (num1==1)?  "monday" :(num1==2)?  "tuesday" :(num1==3)?
                    "wednesday" :(num1==4)? "tuesday"
                    :(num1==5)? "friday" :"satuday";



      }
        else {
            System.out.println(" invaild");
        }
        System.out.println("result = " + result);






    }
}
