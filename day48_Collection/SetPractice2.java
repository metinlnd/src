package day48_Collection;

import javax.swing.plaf.IconUIResource;
import java.util.*;

public class SetPractice2 {


    public static void main(String[] args) {

        String [] arr={" 1223","1","5","2","2","0","3","4","1","3"};
        Set<String>set1=new HashSet<>(Arrays.asList(arr));

        System.out.println(set1);//[1, 2, 3, 4, 5,  1223], ascending order and not duplicate hashset
        Set<String>set2=new TreeSet<>(Arrays.asList(arr));

        System.out.println(set2);
        System.out.println(set2.equals(set1));

        ArrayList<Integer>list= new ArrayList<>();
        list.addAll(Arrays.asList(10,20,10,5,6,8,6,9,5,10,5,8,8,9,6,3));

     list= new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println(list+"linkedhas");



        Integer [] nums={1,2,2,3,4,53,3,4,5,6,7,8,9,2,2,3,4,5,65,43,3,4,4,5,66,654,4,1};//return the 5th element after the duplicates removed.


     nums = new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);

        System.out.println(Arrays.toString(nums));















    }














}
