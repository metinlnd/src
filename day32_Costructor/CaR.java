package day32_Costructor;

import day30_CustomClass.Car;

public class CaR {

    public String brand, model;
    public  int year;
    public double price;
    public String colour;

    public CaR(String brand){

        this.brand= brand;
    }

    public CaR(String brand,String model){
        this(brand);
        this.model= model;
    }

    public CaR(String brand, String model, int year){

        this(brand,model);
        this.year= year;

    }

    public CaR(String brand, String model, int year, double price){
        this(brand,model,year);
        this.price=price;

    }

    public CaR(String brand, String model, int year, double price, String colour) {
       this(brand,model,year,price);
        this.colour = colour;
    }

    public String toString() {
        return "CaR{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}
