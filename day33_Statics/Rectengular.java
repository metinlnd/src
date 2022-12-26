package day33_Statics;

public class Rectengular {

    public double width;
    public double length;
    public static double pi= 3.14;

    public double area(){

       return width*length*pi;
    }


    public  double permeteit(){

        return 2*width*length;

    }

public  static void pi(){


    System.out.println(pi);
}

    @Override
    public String toString() {
        return "Rectengular{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    public Rectengular(double width, double length) {
        this.width = width;
        this.length = length;
    }
}

