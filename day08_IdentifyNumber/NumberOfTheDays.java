package day08_IdentifyNumber;

public class NumberOfTheDays {
    public static void main(String[] args) {
        int number= 5;

        boolean has28days= number==2;
        boolean has30days= number==1||number==3||number==5||number==7||number==9||number==11;
        boolean has31days= !has28days&&!has30days;

        if(has28days){
            System.out.println("28 days");

        }

        if(has30days){
            System.out.println("has30days");

        }

        if(has31days){
            System.out.println("has31days = " + has31days);
        }


    }




}
