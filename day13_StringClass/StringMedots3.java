package day13_StringClass;

import java.util.Objects;

public class StringMedots3 {
    public static void main(String[] args) {
        String str= "java java java";

       String str1= str.replaceFirst("java", "phoyton");
        System.out.println("str = " + str1);
        //str1.replace();
       // str1.trim();
       // str1.charAt();
       // str1.length();
       // str1.toUpperCase();
        String str3= String.valueOf(Objects.equals(str1, str));
        System.out.println("str3 = " + str3);
        String strsubtring = str.substring( 3);

        System.out.println("strsubtring = " + strsubtring);
String word2=" java programing Language";
String indexa= String.valueOf(word2.indexOf("a "));
        System.out.println("indexa = " + indexa);


        String S9= word2.substring(0,word2.indexOf("av"));
        System.out.println("S9 = " + S9);

        System.out.println("=====================================");

























    }
}
