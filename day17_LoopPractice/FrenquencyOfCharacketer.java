package day17_LoopPractice;

public class FrenquencyOfCharacketer {

    public static void main(String[] args) {

String str = "AAABBBC";
char ch= 'A';

int frequency= 0;
        for (int i = 0; i < str.length(); i++) 
        {     char eachchar= str.charAt(i);
        if(ch==eachchar){frequency++;}}
        System.out.println("frequency = " + frequency);

















        
    }
}
