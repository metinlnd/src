package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Warmup2 {
    public static void main(String[] args) {

        String str= "ABD123@8*/-";

        ArrayList<Character>chars= new ArrayList<>();
        for (int i = 0; i < str.length()-1; i++) {
            chars.add(str.charAt(i));}

        ArrayList<Character>letters= new ArrayList<>(chars);
        System.out.println(letters);


letters.removeIf(each->!Character.isLetter(each));

        System.out.println(letters);

ArrayList<Character>digit= new ArrayList<>(chars);
digit.removeIf(each->!Character.isDigit(each));

        System.out.println(digit);

        ArrayList<Character>specialChar=new ArrayList<>(chars);
        specialChar.removeAll(digit);
        specialChar.removeAll(letters);
        System.out.println(specialChar);




    }
}
