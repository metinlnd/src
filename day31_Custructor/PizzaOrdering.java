package day31_Custructor;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {
    public static void main(String[] args) {

        ArrayList<Pizza>pizzas=new ArrayList<>();

        for (int i = 0; i <100 ; i++) {

            Pizza smallPizza= new Pizza('S',2,2);
            Pizza mediumPizza= new Pizza('M',3,4);
            Pizza largePizza= new Pizza('L',4,5);

            pizzas.addAll(Arrays.asList(smallPizza,mediumPizza,largePizza));

        }
        System.out.println("total number of pizza"+ pizzas.size());

        double totalprice= 0;

        for (Pizza each : pizzas) {totalprice +=each.calulateCost();

        }
        System.out.println(totalprice);


















    }
}
