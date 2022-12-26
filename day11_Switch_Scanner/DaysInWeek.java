package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {

     /*
        int number = 5;
        if (number==1)
        {  System.out.println(" monday");} else if (number ==2) {
            System.out.println("tuesday " +);}
        else {System.out.println("wed");}


      */
        int number = 5;

        switch (number) {
//switch epressinon must be data not boolean not double not  long

            case 1:
                System.out.println(" monday");
                break;

            case 2:
                System.out.println(" tuesday");
                break;
            case 3:
                System.out.println(" wed");
                break;
            case 4:
                System.out.println(" thu");
                break;
            case 5:
                System.out.println(" friday");
                break;





        }  System.out.println("number = " + number);
    }
}
