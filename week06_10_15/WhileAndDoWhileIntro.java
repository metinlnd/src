package week06_10_15;

public class WhileAndDoWhileIntro {
    public static void main(String[] args) {


       String str="Java is java in everywhere is Java";
       String word="Java";
       String result= "";
 int counter = 0;

        for (int i = 0; i <= str.length()-4; i++) {

            result= str.substring(i,i+4);

          if(  result.equalsIgnoreCase("java")){

              counter++;
          }

        }
        System.out.println(counter);
















    }
}
