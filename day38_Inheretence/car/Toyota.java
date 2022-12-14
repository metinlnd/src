package day38_Inheretence.car;

public class Toyota extends Car  {


    public Toyota(String color, String model, int year, double price, int miles) {
        super(color, model, "Toyota", year, price, miles);
    }

    public void reliable(){
        System.out.println(brand+model+"is reliable");
    }

}
