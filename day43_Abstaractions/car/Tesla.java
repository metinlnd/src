package day43_Abstaractions.car;

public final  class Tesla extends Car{
    public Tesla( String model, String color, int year, double price) {
        super( "TESLA",model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("just say start");

    }


    public void autopilot(){
        System.out.println("tesla has a auot pilot");
    }

}
