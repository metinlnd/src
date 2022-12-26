package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
// if statemest used for conditions .if the  codtion is true block gets exetuced
        //sigle if /
        //if& elsef for 2 condition
        //mutlit branch if
        /*
        nested if statement


        90 to 100 wxcelen
        80 to 90 great
        70 to 79 good
        60 to 69 passed
        0 to 59 failed
         */



      int score = 59;


        if (score <+100  && score<=0){

            if(score<=59){
                System.out.println(" failed");
            } else if (score<69) {
                System.out.println("passed");
            } else if (score<79) {
                System.out.println(" good");} 
            else if (score<89) {System.out.println("great");}
            else {System.out.println(" excleent");}

        }
        else{
            System.out.println("fAILED");
        }


/*



         int score = 59;
        String result = " ";


        if (score >=0  && score<=100){

            if(score<=59){result=" failed";}
            else if (score<69) {result="passed";}
            else if (score<79) {result=" good";}
            else if (score<89) {System.out.println("great");}
            else {result=" excleent";}

        }
        else { result = "fAILED";}




  System.out.println("result = " + result);*/





















    }



}
