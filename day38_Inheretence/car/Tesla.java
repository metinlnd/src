package day38_Inheretence.car;

public class Tesla extends Car{
    public Tesla(String color, String model, int year, double price, int miles) {
        super(color, model, "TESLA", year, price, miles);
    }


    public void autoPilot(){
        System.out.println(brand+model+"is an autopilot mode");
    }



}
