package day17_LoopPractice;

public class WordFrenquency {
    public static void main(String[] args) {

        String str= "JAVA JAVA JAVA";
int frequency= 0 ;
String result= "";
        for (int i = 0; i <str.length()-3; i++) {
            result=str.substring(i,(i+4));

            System.out.println("result = " + result);
if(result.equals("JAVA")){frequency++;}
        }
        System.out.println("frequency = " + frequency);















    }


}
