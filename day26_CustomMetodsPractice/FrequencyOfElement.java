package day26_CustomMetodsPractice;

import java.util.Scanner;

public class FrequencyOfElement {

    public static void main(String[] args) {
        int [] arry={1,2,3,1,4,4,5,6,};
        int n= frequencyOfElement(arry,1);
        System.out.println(n);



        char [] dfg={'a','c','a','d'};


       int tr= frequencyOfElement(dfg,'a');

        System.out.println(tr);
    }






//returns the frequency of the given element from the given array.
public static int frequencyOfElement(int[] array, int element){ //{1,2,3,1,3,4}{1}

    int count = 0;
    for (int each : array) { if(each==element){count++;}

    } return count;

}

    //returns the frequency of the given element from the given array.
    public static int frequencyOfElement(double[] array, double element){ //{1,2,3,1,3,4}{1}

        int count = 0;
        for (double each : array) { if(each==element){count++;}

        } return count;

    }

    //returns the frequency of the given element from the given array.
    public static int frequencyOfElement(char[] array, char element){ //{1,2,3,1,3,4}{1}

        int count = 0;
        for (char each : array) { if(each==element){count++;}

        } return  count;

    }

    //returns the frequency of the given element from the given array.
    public static int frequencyOfElement(String[] array, String element){

        int count = 0;
        for (String each : array) { if(each.equalsIgnoreCase(element)){count++;}

        } return (count);

    }





}
