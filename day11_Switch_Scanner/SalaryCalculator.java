package day11_Switch_Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        double salary = 100.000;
        double taxrate = 0.3;
        boolean isMarried = true;


        if(salary>=130000){taxrate=0.35;} else if (salary>=100000) {taxrate=0.30;}
        else if (salary>=80000) {taxrate=025;} else {taxrate=0.20;}


            if(isMarried){taxrate-=0.05;}

        double salaryAfterTaX = salary-(salary*taxrate);
        System.out.println(salaryAfterTaX);


        }


    }


