package utilities;

import java.util.Arrays;

public class StringUtility {

// print each characther of given string
 public static void printEachChar(String str){

     for (int i = 0; i <str.length() ; i++) {
         System.out.println(str.charAt(i));}
 }

 // reverse the givin String and returns reversed string
 public static String reverse(String str){
String result="";
     for (int i = str.length()-1; i >=0 ; i--) {

        result +=str.charAt(i);}

     return result;
 }

// check the given String is palindrome retun boolean
public static boolean isPalindrome(String str){

    return reverse(str).equalsIgnoreCase(str);}


    // check if the given is string is anagram , retuns boolean

    public static boolean anagram( String str1, String str2){//abc, bca

     char[] ch1= str1.toCharArray();
     char[] ch2= str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
      return  Arrays.equals(ch1,ch2);


    }


    //removes dublicates from givin string , returns String

    public static String removeDuplicate(String str) {

        String result = "";


        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if (!result.contains("" + each)) {
                result += each;
            }


        }

        return result;
    }

}
