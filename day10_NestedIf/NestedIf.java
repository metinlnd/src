package day10_NestedIf;

public class NestedIf {
    public static void main(String[] args) {


int score = 200;

 if (score>0&&score<=100){
     if (score<60){
         System.out.println(" failed");

     } else {
         System.out.println(" passed");
     }
 }
 else System.out.println(" failed");


        System.out.println(" --------------------------------");


int age = 25;
boolean id= true;

    if(age>=21)  {
        if (id== true){
            System.out.println(" eligible");
        } else {
            System.out.println(" not eligible");
        }

    } else {
        System.out.println("not eligibile");
    }


        System.out.println(" =-------------------");

    int number = 5;


    if (number>0 && number<=7){

       if(number==1){
           System.out.println("monday");
       } else if (number==2) {
           System.out.println(" tuesday");

       } else if (number==3) {
           System.out.println(" wedesday");}
       else if (number==4) {System.out.println(" thursday");}
       else if (number==5) {System.out.println(" friday");}
       else if (number==6) {System.out.println(" saturday");}
       else if (number==7) {
           System.out.println(" sundat");

       }

    }else {System.out.println("invaile");}


















    }
}

