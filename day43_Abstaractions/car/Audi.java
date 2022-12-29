package day43_Abstaractions.car;

public final  class Audi extends Car{
    public Audi( String model, String color, int year, double price) {
        super("audi", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("turn the key");

    }

    public void autopark(){
        System.out.println(getBrand()+"has a aouto park feature");
    }


}
