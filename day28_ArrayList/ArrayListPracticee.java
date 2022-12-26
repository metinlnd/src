package day28_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPracticee {

    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);


        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {

            list.set(i, list.get(i)*2);

        }
        System.out.println(list);
        Collections.swap(list,0,list.size()-1);
        System.out.println("===========================");
        ArrayList<String>employes= new ArrayList<>();

        employes.add("suat");
        employes.add("hulya");
        employes.add("metin");
        employes.add("mujra");
        employes.add("ali");
        employes.add("ald");
        employes.add("suat2");
        employes.add("suat5");

        System.out.println(employes);
        employes.remove(1);
        System.out.println(employes);
employes.add("metin1"); ;
        System.out.println(employes.get(3));
        System.out.println(employes.set(0,"metin00"));
       // System.out.println(employes);










    }
}
