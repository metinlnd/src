package day08_IdentifyNumber;

public class EligibleToVote {
    public static void main(String[] args) {
        int age = 18;
        String citizenship = "USA";
        String notInPrison= "Free";




        if(age>=18 && citizenship== "USA" && notInPrison=="Free"){
            System.out.println("eligible to vote");


         }



 boolean  isEligible = age>18 &&citizenship=="USA"&& notInPrison=="Free";
        System.out.println("isEligible = " + isEligible);






    }




}
