package day50_Collections_Map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveEven {
    public static void main(String[] args) {

        Set<Integer>set= new HashSet<>(Arrays.asList(1,2,3,4,5,2,3,4,2,3,4,5));

    set.removeIf(p->p%2==0);
        System.out.println(set);


    }
}
