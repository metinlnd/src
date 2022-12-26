package Week11_11_19_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayslitIntro {
    public static void main(String[] args) {
        ArrayList<String>cities= new ArrayList<>();
        cities.add("london");

        cities.addAll(Arrays.asList("metin","londra","kakalamis"));
        System.out.println(cities);
        System.out.println(cities.indexOf("metin"));


        ArrayList<Character>charas=new ArrayList<>();
        charas.addAll(Arrays.asList('S','D','D','D'));
        System.out.println(charas);

        int metin= Collections.frequency(charas,'D');

        System.out.println(metin);


        //charas.removeIf(character -> character=='D');
        System.out.println(charas);

Collections.sort(charas);
        System.out.println(charas);



    }
}
