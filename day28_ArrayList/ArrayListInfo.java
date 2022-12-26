package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListInfo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>();

        ArrayList<String> names= new ArrayList<>();
        System.out.println(names);
        System.out.println(numbers);

int[] abc={1,2,3,4,5};





        System.out.println("dddddddddddd"

        );
        ArrayList<Integer>add= new ArrayList<>();

convertoArryatoARRYALIST(abc);
        System.out.println("===========================");
        System.out.println(convertoArryatoARRYALIST(abc));


        ArrayList<Integer> numbersf= new ArrayList<>();

        numbersf.addAll(Arrays.asList(20,20,20,40));
        Integer a=  numbersf.get(2);
        System.out.println(a);

        Integer b= numbersf.set(2,45);
        System.out.println(numbersf);
        System.out.println(b);

        for (int i = 0; i <numbersf.size() ; i++) {

           numbersf.set(i,2*numbersf.get(i));


        }
        System.out.println(numbersf);

ArrayList<Integer>result=new ArrayList<>();


           for (Integer each1 : numbersf) {


 if(numbersf.lastIndexOf(each1)==numbersf.indexOf(each1)){

     result.add(each1);
 }

           }
        System.out.println("===dd=d=d==d=d=");
        System.out.println(result);















    }


    public static ArrayList<Integer>convertoArryatoARRYALIST(int [] arry){

        ArrayList<Integer>convertoArraytoArraylist=new ArrayList<>();

        for (int each : arry) {


            convertoArraytoArraylist.add(each);


        } return convertoArraytoArraylist;







    }







}
