package day23_CustomMetods;

public class CustomMetodWithParameter {



    public static void main(String[] args) {

      ageOfPerson(52);

      oddoreven2(200);

        oddoreven(10);// metod demands additional info to complete to task.
    }


    public static void ageOfPerson(int bithyear){
        int age= 2022- bithyear;

        System.out.println(" your agei is :" + age);
    }







    public static void oddoreven(int number) {if (number % 2 == 0) {System.out.println(" even");} else {System.out.println(" odd");}}



 //public static void printnumbers()

















    public static void oddoreven2(int number){

        if(number%2==0){
            System.out.println("its even");
        }else {
            System.out.println("odd");
        }

    }



}