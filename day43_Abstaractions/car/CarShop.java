package day43_Abstaractions.car;

public class CarShop {
    public static void main(String[] args) {

      //  Car car1=new Car("CYDEO","BLUE","X",2010,2514) {};we can not create objcet from abstract class. cos class is no conrete.

       Honda honda= new Honda("honda","ty","blue",2010,2514);

       Audi audi= new Audi("audi1","white",2011,5655);
       Tesla tesla= new Tesla("tx","black",2022,45500);

        System.out.println(honda);
        System.out.println(tesla);
        System.out.println(audi);

        honda.setColor("black");

        System.out.println(honda);

        honda.start();
        tesla.start();


    }
}
