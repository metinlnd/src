package day42_exeptions;

public class Warmup {

    public static void main(String[] args)  {

        for (int i = 1; i <=30; i++) {
            System.out.println("\rpush up"+i);

            sleep(1);
        }


        System.out.println("push up completed" );


        System.out.println("pull up started");

        for (int i = 1; i <20 ; i++) {

            System.out.println("\r pull up "+i);
            sleep(10);

        }





        System.out.println("pull up completed");

// first try and catch medots handle with






    }



public static void sleep(double seconds){

    try {
        Thread.sleep((long)(seconds*1000));
    } catch (InterruptedException e) {
        e.printStackTrace();
    }


}




}
