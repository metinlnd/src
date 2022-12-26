package day31_Custructor;

public class Rectangular {

    public double length, width;


    public Rectangular(double length, double width) {
        this.length = length;
        this.width = width;
    }

public double calcArea(){
        return length*width;
}


public double calPerimeter(){
        return 2*(length+width);
}


    public String toString() {
        return "Rectangular{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + calcArea() +
                ", perimeter=" + calPerimeter() +
                '}';
    }



}
