package day43_Abstaractions.car;

public final class Honda extends Car{

    @Override
    public void start() {
        System.out.println("twist the ignition");

    }

    public Honda(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }
}
