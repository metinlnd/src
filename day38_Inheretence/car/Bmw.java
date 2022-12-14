package day38_Inheretence.car;

public class Bmw extends Car {
    public Bmw(String color, String model, int year, double price, int miles) {
        super(color, model, "BMW", year, price, miles);
    }

    public void Breakdown(){
        System.out.println(brand+model+"breaks down after 100k miles");
    }

    public void Racing(){

        System.out.println(model+brand +"is racign");

    }

}
