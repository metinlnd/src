package day32_Costructor;

public class Circle {
    public double radius;
     public static double pi= 3.14;



    public  double calcAresa(){


      return   radius*radius*pi;

    }

    public double calPerimeter(){

       return radius*pi*2;

    }


    public static void printPi(){


        System.out.println(pi);
    }



    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}

