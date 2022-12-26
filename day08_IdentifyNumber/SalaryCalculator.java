package day08_IdentifyNumber;

public class SalaryCalculator {
    public static void main(String[] args) {
         int hourlyrate = 50,
             weeklyHour = 45;


         double stateRate = 6.5,
                 federalRate=26.2;

// salary before tax


        int salaryBeforeTax = hourlyrate*weeklyHour*52;
        double statetax = salaryBeforeTax*stateRate/100;
        double fedaralTax =salaryBeforeTax*federalRate/100;

        System.out.println("fedaralTax = " + fedaralTax);
        System.out.println("salarybeforetax " + salaryBeforeTax);












    }







}
