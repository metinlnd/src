package day09_If_Statements;

public class Leapy {
    public static void main(String[] args) {

        int year =2000;
        boolean leapyear = year % 4 ==0;
        if (leapyear){
            System.out.println("leapyear = " + leapyear);
        }

        if(!leapyear){
            System.out.println(" not a leap year");
        }


        System.out.println("-=------------------------------");


        if(leapyear){
            System.out.println("leapyear = " + leapyear);
        } else {
            System.out.println("not a leap year");
        }





    }




}
