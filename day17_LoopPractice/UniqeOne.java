package day17_LoopPractice;

public class UniqeOne {
    public static void main(String[] args) {


        String str= "aabccd";
        String result= "";


        for (int i = 0; i <= str.length()-1; i++) {char ch= str.charAt(i);

            if(str.indexOf(ch)==str.lastIndexOf(ch)) {result += ch;}}

        System.out.println("result = " + result);














    }
}
