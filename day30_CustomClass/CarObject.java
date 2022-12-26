package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;

public class CarObject {
    public static void main(String[] args) {

     Car car1= new Car();
      car1.setInfo("toyota","cammy","white",1980,3500);

 car1.start();

        System.out.println(car1);


        Car car2= new Car();
        System.out.println(car2);//nullllll


        car2.setInfo("bmw","e3","blue",1999,2452);
        System.out.println(car2);

        Car car3= new Car();

        car3.setInfo("mercedes","c+","white",2009,4500);

        ArrayList<Car>carslist=new ArrayList<>();
        carslist.addAll(Arrays.asList(car1,car2,car3));


        for (Car each:carslist) {System.out.println(each.brand);}

        System.out.println("********************************************************");



        carslist.removeIf(each->each.brand.equals ("bmw")|| each.year >(1948));

        System.out.println(carslist);






Car car4= new Car();
car4.setInfo("tesla","b3","black",2000,3500);



    }
}
