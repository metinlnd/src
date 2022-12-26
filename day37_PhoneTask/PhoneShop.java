package day37_PhoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone1= new Iphone("IPHONE 12","6",12.34,"WHITUE");

        Samsung samsung1= new Samsung("g20","3",123.2,"yellow");

        Nokia nokia1= new Nokia("Nokiam","4",34.12,"blue");


        System.out.println(iphone1);
        System.out.println(samsung1);
        System.out.println(nokia1);


        iphone1.call(911);
        iphone1.text(123456);
iphone1.facetime(1234587);

iphone1.facetime("metin5153@gmial.com");

        System.out.println("====================");



nokia1.call(911);
nokia1.text(564);

samsung1.freeze();
samsung1.text(335);


        System.out.println(Phone.hasbattery);

        System.out.println(Samsung.hasbattery);
    }



}
