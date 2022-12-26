package day34_GarbageCollector_AccesModifer;

public class StaticvsConstroctor {

static {
    System.out.println("static block");
}

    public  StaticvsConstroctor(){

        System.out.println("Constructor");
    }


    public static void main(String[] args) {
        System.out.println("main metod");

        new StaticvsConstroctor();
        new StaticvsConstroctor();
        new StaticvsConstroctor();
        new StaticvsConstroctor();
        new StaticvsConstroctor();
        new StaticvsConstroctor();









    }





}
