package day37_PhoneTask;

public class Phone {


    public String brand;


    public  String model;

    public  String size;

    public  double price;
    public String color;


    public static boolean hasbattery;



    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }


    public  void call(long phonenumber){
        System.out.println(brand+""+model+""+phonenumber+" is calling");
    }


    public void text(long phonenumber){
        System.out.println(brand+model+"is texting");
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}


