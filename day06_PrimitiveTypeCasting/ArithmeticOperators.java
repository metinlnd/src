package day06_PrimitiveTypeCasting;

import java.time.LocalDate;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println(10.5/3.3);
        System.out.println(10d/4);
        System.out.println(100D);

        char c = 'f';
        boolean isPermitted =  true;

        System.out.println("isPermitted = " + isPermitted);
        System.out.println("c = " + c);
        String name = new String("ahmat");
        System.out.println("name = " + name.length());
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);


        int a = 200;
        int b = a;
        a = 100;
        System.out.println( b + a );






    }





}
