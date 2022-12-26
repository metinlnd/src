package day09_If_Statements;

public class PosNegZero {
    public static void main(String[] args) {
        int n =100;//posivi e negarif or zero

        if (n>0){
            System.out.println("n = " + "positive"); }

        if (n==0){
            System.out.println("zaro " + n);

        }
        if (n<0){
            System.out.println("negatif " + n);
        }

        System.out.println(" ______-----------");

        // multiple
        boolean positive = n > 0;
        boolean negative = n< 0;

        if (positive){
            System.out.println("positive = " + positive);}
        else if (negative){
            System.out.println("negative = " + negative);
        }
        else {
            System.out.println("zero" );
        }









    }
}
