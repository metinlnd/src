package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {

                String [] countries={"alamanya","denmark","poland","UNITED kingdom"};
// converting to array to arraylist
        ArrayList<String>list= new ArrayList<>(Arrays.asList(countries));

        list.removeIf(each->each.length()>=10);

 // converting to arraylist to array


 countries=list.toArray(new String[0]);


        System.out.println(Arrays.toString(countries));



    }
}
