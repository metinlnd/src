package day22_practice;

import java.util.Arrays;

public class Multidimens2 {
    public static void main(String[] args) {

        int [] arr1={1,2,3};
         int [] arr2={4,5,6};
         int[]  arr3={7,8,9};

         int[][] arrd2= {{1,2,3},{4,5,6},{7,8,9,}};
        //                     0       1       2             0           1         2
        int [][][] ard3d= {{{1,2,3},{4,5,6},{7,8,9,} },  {{10,20,30},{40,50,60},{0,80,90,} }        };
        //                            0                                  1

        System.out.println(Arrays.deepToString(ard3d));
        System.out.println(Arrays.deepToString(ard3d[1]));
        System.out.println(Arrays.toString(ard3d[1][2]));
        System.out.println(ard3d [1][1][1]);


        for (int[][] ints : ard3d) {

            for (int[] anInt : ints) {
                for (int i : anInt) {

                    System.out.print(i);
                    
                }
                
            }
            System.out.println();
            
        }





    }
}
