package day21_Aray;

import java.util.Arrays;

public class ChararrayWithAnagram {
    public static void main(String[] args) {
        String str1="acbd";
        String str2="dbca";


        char[] str11= str1.toCharArray();
        char[] str22= str2.toCharArray();

        Arrays.sort(str11);
        Arrays.sort(str22);


        boolean anagray=Arrays.equals(str11,str22);
        System.out.println(anagray);
        












    }
}
