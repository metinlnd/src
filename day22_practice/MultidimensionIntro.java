package day22_practice;

public class MultidimensionIntro {
    public static void main(String[] args) {


       int [][] arry2d= { {1,2,3},{4,5,6,7,8,5,6,7,7,8,},{8,9,10,11}};
      //  System.out.println(Arrays.deepToString(arry2d));
       //  System.out.println(Arrays.toString(arry2d[1]));

        for (int i = 0; i < arry2d.length; i++) {

          //  System.out.println(Arrays.toString(arry2d[i]));

            for (int j = 0; j < arry2d[i].length; j++) {


                System.out.println(arry2d[i][j]);
              //  System.out.println(" ==============");

               // Arrays.sort(arry2d[2]);

            }


        }

       // System.out.println(" ===========");
        //System.out.println(arry2d.length);




       // System.out.println(arry2d[1][2]);


    }
}
