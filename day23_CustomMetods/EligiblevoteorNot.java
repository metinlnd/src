package day23_CustomMetods;

public class EligiblevoteorNot {
 public static void  main(String[] args) {
        EligiblevoteOrNote(19,true);

    }


      public static void EligiblevoteOrNote(int age, boolean uscitizen){

        if (age>18&&uscitizen==true){
            System.out.println("eligible");
        }else {
            System.out.println("no");
        }



    }

}
