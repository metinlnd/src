package day38_Inheretence.car;

public class Car {


    public String color, model, brand;

    public int year;
    public double price;

    public int miles;

    public Car(String color, String model, String brand, int year, double price, int miles) {
        this.color = color;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.miles = miles;
    }


    public void start(){
        System.out.println(brand+model+"is driving");
    }

    public void drive(){
        System.out.println(brand+model+"is starting");
    }
    /*
    public void fly(){} fly metod is not comon for all parent class.its must be contains common features.

     */


    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", miles=" + miles +
                '}';
    }




}