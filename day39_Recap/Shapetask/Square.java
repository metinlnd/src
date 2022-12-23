package day39_Recap.Shapetask;

public class Square extends Shape{

    private double side;

    public Square(String name) {
        super(name);
    }


    public  double getside(){

        return side;

    }


    public void setSide(double side){

        if(side<=0){System.err.println("invalid side"+side);}
        this.side=side;

    }








}
