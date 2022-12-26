package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {

        int n =100;
        // even or odd

        if(n%2==0){
            System.out.println(" even");
        } else {
            System.out.println(" odd");

        }

        System.out.println("------------------------------");


        String result = (n%2==0)? "even":"odd";
        System.out.println("result = " + result);


        System.out.println(" --------------------------------");
         int age = 23;
         if (age>21){
             System.out.println(" elegilble for alcohol");

         } else {
             System.out.println(" not eligible");
         }
        System.out.println(" = sssssssssss");

       String result1 = (age>21)? "elegible":"not elegible";
        System.out.println("result1 = " + result1);


        System.out.println(" =--------------------------");

        int number = 100;

        if(number>0){System.out.println(" positeve");}
        else {
            System.out.println("negative");}

        System.out.println("number = " + number);
        System.out.println(" = ssssss");
String numd =  (number>0)? "positve" : "negaive";
        System.out.println("numd = " + numd);






    }
}

