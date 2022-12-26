package day32_Costructor;

import java.util.concurrent.Callable;

public class ConstructorCalls {


    public  ConstructorCalls(){

        System.out.println("default constocter");

    }

    public  ConstructorCalls(int a){

        this();
        System.out.println("Constrocter with argument");

    }

    /*public ConstructorCalls(String str){

        this.str= str("sdf")

        System.out.println("cosntoructorf with string argument");
    }*/

    public static void main(String[] args) {


        ConstructorCalls obj1= new ConstructorCalls();
        System.out.println("====================");

        ConstructorCalls obj2= new ConstructorCalls();






        }







    }






