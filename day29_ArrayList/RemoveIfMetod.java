package day29_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveIfMetod {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7));

        //for (int i = 0; i < list.size(); i++) {if(list.get(i)%2!=0){list.remove(i);}

        System.out.println(list);
list.removeIf(p->p<5);//lambda expression
        System.out.println(list);

        System.out.println("===s=s=s=s==s==s=s=s=s=s==s=s=s=s==s=s=s==s=s=s=");

ArrayList<Integer>list1=new ArrayList<>();
list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
list1.removeIf(each->each%2==0);
        System.out.println(list1);

        System.out.println("++++++++++++++++++++++++++++++++++++++++sssssss++++++++++++++");


        ArrayList<String>list2=new ArrayList<>();

        list2.addAll(Arrays.asList("METIN","USAE","YILAZ","MUSTAFA"));

        list2.removeIf(each->each.startsWith("M"));
        System.out.println(list2);

        System.out.println("====================================================");
ArrayList<String>names=new ArrayList<>();
 names.addAll(Arrays.asList("anna","rebecca","java","eve","pyhotn"));

 names.removeIf(each-> !StringUtility.isPalindrome(each));
        System.out.println(names);






    }



    }

