package week06_10_15;

public class WarmUP {
    public static void main(String[] args) {


/* Given a non-empty string like "Code" print a string like below output.

 *                                 Code → "CCoCodCode"
 *                                 abc → "aababc"
 *                                 ab → "aab"

2

5

You do not have permission to send messages in this channel.*/


        String word= "Code";
String temp="";

        for (int i = 0; i < word.length()-1; i++) {
            String str= word.substring(0,i);

            temp+=str;

            System.out.println(temp+word);


        }









    }
}
