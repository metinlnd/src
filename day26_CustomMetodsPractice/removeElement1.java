package day26_CustomMetodsPractice;

import utilities.ArrayUtility;

public class removeElement1 {

// remove the index from the array returns new array
    public static int[] removeElement(int[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid index number");
            System.exit(0);}

        int[] result = {};

            for (int i = 0; i < array.length; i++)
            {if (i != index) {result = ArrayUtility.addElement(result, array[i]);}}

            return result;
        }

    }
