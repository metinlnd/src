package day06_PrimitiveTypeCasting;

public class ConverdaysTo {

    public static void main(String[] args) {

        // Create class named ConvertMiutesToYearAndDay, write a Java program to convert minutes into a number of years and days.
        //
        //     Input the number of minutes: 3456789
        //     Expected Output :
        //     3456789 minutes is approximately 6 years and 210 days

     int year = 3456789/(60*24*365);
     int  remainder= 3456789%(60*24*365);
     int days = remainder/(60*24);
        System.out.println("days = " + days);
        System.out.println("year = " + year);
        System.out.println("days = " + days);









    }

}
