package Week12_12_1221;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CatObjects {

    public static void main(String[] args) {


        Cat cat1= new Cat("blue","mor",2020,'f');
        Cat cat2= new Cat("blue1","mor1",20201,'m');
        Cat cat3= new Cat("blue2","mor2",20202,'f');



        Cat [] cats= {cat1,cat2,cat3};


        ArrayList<Cat>catsarryed = new ArrayList<>(Arrays.asList(cat1,cat2,cat3));
        System.out.println(catsarryed);

        System.out.println("please enter first cat name");

        Scanner scan= new Scanner(System.in);

        String name= scan.next();
        cat1.name= name;
        for (Cat each : catsarryed) {

            catsarryed.removeIf(p->p.name.equals("blue1"));

        }


        System.out.println(catsarryed);











    }







}
