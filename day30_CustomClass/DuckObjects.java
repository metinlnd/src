package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DuckObjects {
    public static void main(String[] args) {


        Duck duck1 = new Duck("aysa", "dayda", "beyaaz", 'f', true, 200, 400);
        Duck duck2 = new Duck("metin", "husyk", "white", 'f', true, 2008, 200);

        System.out.println(duck1);
        System.out.println(duck1.name);
        ArrayList<Duck>Ducklist=new ArrayList<>(Arrays.asList(duck1,duck2));

        Ducklist.add(0,new Duck("ahmad","d","ddd",'f',true,200,2001));

int a= Ducklist.size();
        System.out.println(a);
        System.out.println("====================");

        System.out.println(Ducklist);

 duck1.eat();


  ArrayList<Duck>ducks=new ArrayList<>();
  ducks.addAll(Arrays.asList(duck1,duck2));






    }
}