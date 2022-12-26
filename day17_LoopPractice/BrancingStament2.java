package day17_LoopPractice;

public class BrancingStament2 {
    public static void main(String[] args) {
        for (char i = 'A'; i <='E' ; i++) {

            if (i=='C') {continue;}// continue skip means


            System.out.println("i = " + i);



        }
        System.out.println(" ========================");

        for (int i = 1; i <10 ; i++) {

           if(i%2 !=0){continue;}


            System.out.println("i = " + i);

        }








    }
}
