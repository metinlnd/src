package day17_LoopPractice;

public class Paligdram {
    public static void main(String[] args) {


        String word = "Level";
        String reverse="";

        for (int i = word.length()-1; i>=0 ;i --) 
        {reverse+= word.charAt(i);}
        
        boolean ispalidrome= reverse.equalsIgnoreCase(word);
        System.out.println("ispalidrome = " + ispalidrome);

























    }
}
