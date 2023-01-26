package day45_Interface_Intro;

public interface ProperitesOfInterface {
    int a = 100;//static and final

    static int b = 200; //final by default
     /*
    public ProperitesOfInterface(int a){

        this.a= a;


    }*/

    /*
    static {
        b=100;

    }*//*
    public void metod1(){
        System.out.println("instance metod");
    }
    */

    public static void metod2() {System.out.println("static metod");}

    default void method(){
        System.out.println("default method");
    }


    









}