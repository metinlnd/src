package day04_Variable;

public class PrimitivesIntro {
    public static void main(String[] args) {
        //age: 38 old
        // Datatybe Variable name= DATA
        byte age = 38;
        // weight:160 pounds
        //byte weight= 160; is out of byte range
        //byte num=  -129;
        short weight = 160;// 160 is a range of short
        //salary  100000$
        //short salary= 100000;
        int salary = 100_000;  // underscore for readable

        long asset;
        asset = 3_3000_000_000000L;

// TAX RATE=0.26
        float tax = 0.26F;

        double PI = 3.14;
        //double> long>int> byte


        char ch1 = 35;
        System.out.println("ch1 = " + ch1);
        System.out.println("ch1 = " + ch1);

        char gender = 'F';          // char is always single charcter
        System.out.println("gender = " + gender);
        System.out.println("gender = " + gender);

        char yesNO = 'y';
        System.out.println("yesNO = " + yesNO);
        char ch5 = 't';
        System.out.println("ch5 = " + ch5);

        boolean isEmployeed = true;   // boolean is always true or false
        boolean isMarried = false;
        boolean result = 100 > 30;
        System.out.println("result = " + result);
        System.out.println("isMarried = " + isMarried);
        System.out.println("isEmployeed = " + isEmployeed);

    }

    }
