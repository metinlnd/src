package day30_CustomClass;


import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Test {
    public static void main(String[] args) {


     String str= "123abc*&^";

        ArrayList<Character>Charlist=new ArrayList<>();

        for (int i = 0; i <str.length()-1 ; i++) {



Charlist.add(str.charAt(i));

        }
        System.out.println(Charlist);

ArrayList<Character>Letters=new ArrayList<>(Charlist);

        System.out.println(Letters);


Letters.removeIf(each->!Character.isLetter(each));

        System.out.println(Letters);

ArrayList<Character>SpecialCHAR= new ArrayList<>(Charlist);

SpecialCHAR.removeIf(character -> !Character.isLetterOrDigit(character));






    }





}



