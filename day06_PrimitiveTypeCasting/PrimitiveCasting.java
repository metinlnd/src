package day06_PrimitiveTypeCasting;

public class PrimitiveCasting {

    public static void main(String[] args) {
        byte a = 100;
        short b = a;

        // impilicit casting no worries but explicit casting you must do manually
        // double>float>long>int>short>byte


        long j = 1000;
        short k = (short) j;
        System.out.println(j + k);


        double d1 = 20.5;
        short s1 = (short) d1;





    }


}



