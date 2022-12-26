package day25_CustomMetods;

import utilities.StringUtility;

public class Task {
    public static void main(String[] args) {


        String str="metin";

        //StringUtility.printEachChar(str);



       String str1= StringUtility.reverse(str);
        System.out.println(str1);


         boolean ntr= StringUtility.isPalindrome(str);
        System.out.println(ntr);

 String [] names={"anna","metin","pyhton","mom"};

 int count = 0;

        for (String each : names) {

            if(StringUtility.isPalindrome(each)){count++;}

        }
        System.out.println(count);



String abc= "aaabc";
String abc1= "bca";

boolean r= StringUtility.anagram(abc, abc1);

        System.out.println(r);



String adk= StringUtility.removeDuplicate(abc);
        System.out.println(adk);

    }



}
