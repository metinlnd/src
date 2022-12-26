package day22_practice;

public class reversedloop {
    public static void main(String[] args) {

        int [][] arry2d= { {1,2,3},{4,5,6,7,8,5,6,7,7,8,},{8,9,10,11}};


        for (int i = arry2d.length - 1; i >= 0; i--) {// i index number of 1d  array statring from last index to 0.


            for (int j = 0; j < arry2d[i].length; j++) {// j index number of element


                System.out.print(arry2d[i][j]);

            }
            System.out.println();






                }System.out.println(" ==================================================");



        for (int i = 0; i < arry2d.length; i++) {


            for (int j = arry2d.length - 1; j >= 0; j--) {


                System.out.print(arry2d[i][j]);









            } System.out.println();

            for (int[] each : arry2d) {
                for (int each1 : each) {
                    System.out.println("each1 = " + each1);
                    
                }
                
            }



















        }




        }









    }

