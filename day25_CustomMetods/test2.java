package day25_CustomMetods;

import utilities.ArrayUtility;

public class test2 {
    public static void main(String[] args) {

        int [] arry= {1,2,3,4,5};

        ArrayUtility.printEachElement(arry);



        double [] arry2={2.1,4.43,4.4};
        ArrayUtility.printEachElement(arry2);

char[] arr3= {'a','a','b','c','e'};

        ArrayUtility.printEachElement(arr3);


        String[] arr4= {"metgin","yilmaz"};

        ArrayUtility.printEachElement(arr4);

int max =ArrayUtility.max(arry);
        System.out.println(max);

boolean metin= ArrayUtility.contain(arry,9);

        System.out.println(metin);
              }
    }

