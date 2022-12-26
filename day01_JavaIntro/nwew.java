package day01_JavaIntro;

public class nwew {
    public static void main(String[] args) {

 int total= 0;

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                for (int k = 0; k < 2; k++) {
                   total+= k+j+i;
                }

            }

        }
        System.out.println(total);


int totaleven =0;
int totalodd= 0;

        System.out.println("===================");
        int [] arry={1,2,3,4,5,6,7,8,9,10};


        for (int each : arry) {

            if(each%2==0){

                totaleven+=each;

            }else {totalodd+=each;}


        }
        System.out.println(totaleven);
        System.out.println(totalodd);






    }
}
