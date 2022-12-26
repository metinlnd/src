package day10_NestedIf;

public class nameOftheMONTH {
    public static void main(String[] args) {
        int number = 5;
        String names = "";


        if(number>=1 && number<=7){
            if (number==1){
                names = " jan";
            } else if (number==2) {
                names = " feb";
            } else if (number==3) {
                names = " marc";

            } else if (number==4) {
             names = " april";

            } else if (number==5) {names= " may";}
            else if (number==6) { names ="jun";}
            else if (number==7) {names="july";}

        }
        else { names = " invaile";}


        System.out.println("names = " + names);



        // : else
        // ()












    }
}
