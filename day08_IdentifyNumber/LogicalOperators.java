package day08_IdentifyNumber;

public class LogicalOperators {
    public static void main(String[] args) {
        String name = "Steven";
        int age= 19;
        String citizinship = "UK";

        boolean isEligible = age>= 18 && citizinship == "USA";
        System.out.println("isEligible = " + isEligible);



// age>= 19 && citiziten == "USA"

        //LOAN
        String name1 = "jOHN";
        double creditScore= 720;
        int age1 = 23;

        boolean loanapplyEligility= age1>=22 && creditScore>=700;
        System.out.println( name1+""+"is elegiliby for loan "+""+ loanapplyEligility);


        // !! or or


        int age3 = 30;
        char gender= 'F';

        boolean iseliegle1 = age3>=25 && ( gender == 'F'|| gender=='M');
        System.out.println("iseliegle1 = " + iseliegle1);




        // apply for citizinship

        String coutnryOfBirth = "USA";
        String marriedOfUsCitizinship= "USA";

        boolean applyForCitizinship = coutnryOfBirth =="USA" || marriedOfUsCitizinship =="USA";




        // Scholarship

        double gpa= 3.5;
        int familyIncome= 10000;
         boolean scholarShip = gpa>=3.5 && familyIncome<=10000;



         int score = 85;
         boolean pass = score>=85;
         boolean failed= !pass;








    }



}
