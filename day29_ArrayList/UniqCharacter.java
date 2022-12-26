package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqCharacter {
    public static void main(String[] args) {

        String str= "aaabcccdeeef";

        String[] arr= str.split("");
        System.out.println(Arrays.toString(arr));
        ArrayList<String>list=new ArrayList<>(Arrays.asList(str.split("")));

        System.out.println(list);

       String uniqe="";

        for (String each:list) {int frequency= Collections.frequency(list,each);

            if (frequency==1){uniqe+=each;}}


        System.out.println(uniqe);



    }

    }

