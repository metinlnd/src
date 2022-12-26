package day09_If_Statements;

public class Midnumber {
    public static void main(String[] args) {
        int a = 60;
        int b = 50;
        int c= 80;

        boolean midnumber1 = (a>b && a<c) || (a>c &&a<b);

        boolean midnumber2 = (b>c && b<a) ||( b>c&& b<c);

        boolean midnumber3 = !midnumber1&&!midnumber2;

        if(midnumber1){
            System.out.println(a);

        }

        if(midnumber2){
            System.out.println("b = " + b);
        }

        if (midnumber3){
            System.out.println("c = " + c);
        }










    }
}
