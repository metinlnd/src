package day33_Statics;

public class RECTENGUALAROBJECT {
    public static void main(String[] args) {

    Rectengular rectengular1= new Rectengular(22,32);
        System.out.println(rectengular1);
        System.out.println(rectengular1.area());
        System.out.println(rectengular1.length);
        System.out.println(rectengular1.permeteit());
        System.out.println(Rectengular.pi);

      double a=  rectengular1.pi;

        System.out.println(rectengular1.pi);

    }


public static int a;
 public static char b;
 public static double bel= 2.23;


 static {

     a= 345;
     b='f';
     bel=3;


 }






}
