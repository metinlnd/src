package day28_ArrayList;

import java.util.ArrayList;

public class Uniqelement {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();

        list.add("metin1");
        list.add("metin2");
        list.add("metin3");
        list.add("metin1");
        list.add("metin4");
        list.add("metin4");
        list.add("metin5");
        list.add("metin5");
        list.add(3,"ahmet");

        System.out.println(list);

        ArrayList<String>uniqe=new ArrayList<>();
        for (String each:list) {
            if (list.indexOf(each)==list.lastIndexOf(each)) {
                System.out.println(each);

                uniqe.add(each);
                System.out.println(uniqe);

            } boolean t1= uniqe.contains("metin");

            System.out.println(t1);


            }

        }











    }

