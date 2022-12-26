package day32_Costructor;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetdeneObject {

    public static void main(String[] args) {





        Carpetdene carpet1 = new Carpetdene(2, 4, 5, true);

        Carpetdene carpet2 = new Carpetdene(2, 3, 7, true);

        Carpetdene carpet3 = new Carpetdene(5, 7, 8, true);


        Carpetdene [] carpetdenes= {carpet1,carpet2,carpet3};


        ArrayList<Carpetdene>carpetdenes1= new ArrayList<>(Arrays.asList(carpet1,carpet2,carpet3));




    }

}
