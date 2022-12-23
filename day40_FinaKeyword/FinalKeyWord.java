package day40_FinaKeyword;

public class FinalKeyWord {
   final String birtDay;
    final String name="java";

   public FinalKeyWord(String birtDay){
       this.birtDay= birtDay;

   }



//final means once for ever.




    public static void main(String[] args) {

      final   double pi=3.14;


       // System.out.println(FinalKeyWord.);


        FinalKeyWord obj= new FinalKeyWord("May/01");

        System.out.println(obj.birtDay);

       // System.out.println(name);




    }
}
