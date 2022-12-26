package day37_PhoneTask;

public class  Iphone extends Phone {


    public Iphone( String model, String size, double price, String color) {
        super("APPLE", model, size, price, color);
    }


    public void facetime(long phonenumber){

        System.out.println(brand+""+model+"is having facetime calling");
    }


    public void facetime(String email){
        System.out.println(brand+""+model+""+"is having facetime calling with email; "+ email);
    }

}
