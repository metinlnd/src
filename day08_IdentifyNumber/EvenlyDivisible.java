package day08_IdentifyNumber;

public class EvenlyDivisible {
    public static void main(String[] args) {
        int divisible1 = 65;

        boolean divisible2 = divisible1 % 2 ==0;
        System.out.println("65 is divisible by 2 :"+ divisible2);




         boolean divisible3 = divisible1 % 3 ==0;
        System.out.println("divisible3 = " + divisible3);


         boolean divisible4 = divisible1  % 5 ==0;
        System.out.println("divisible4 = " + divisible4);


        int  year = 2000;
        boolean leapyear = year % 4 == 0;
        System.out.println("leapyear is every 4 years. so 2000 is aleap year"+" "+ leapyear);









    }






}
