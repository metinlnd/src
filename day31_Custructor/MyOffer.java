package day31_Custructor;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffer {

    public static void main(String[] args) {




        Offer offer1= new Offer();
        offer1.setinfo("VA","AMAZON","sdet",50000, true,true,true,true);


        Offer offer2= new Offer();
        offer2.setinfo("VA","SONY","SDET",45.000,true,true,true,true);



        Offer offer3= new Offer();
        offer3.setinfo("WDC","PTT", "qa",55.000, true, false,false,true);


        Offer offer4= new Offer();
        offer4.setinfo("tx","bankof america","ba",78.000,true,false,false,true);


        Offer offer5= new Offer();
        offer5.setinfo("wa","capitalone","sm",48000,true, true, false, false);












        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);
      Offer[] myoffers={offer1,offer2,offer3,offer4,offer5};


       ArrayList<Offer>fulltimeoffers=new ArrayList<>(Arrays.asList(myoffers));

     //  fulltimeoffers.removeIf(p->!p.isFullTime);

       ArrayList<Offer>localplaces= new ArrayList<>();













          fulltimeoffers.removeIf(offer -> !offer.isFullTime);
        System.out.println(fulltimeoffers);

        System.out.println("=============================");

       ArrayList<Offer>localoffers= new ArrayList<>(Arrays.asList(myoffers));
        System.out.println("====================hh========");
       localoffers.removeIf(p -> !p.location.equals("VA"));
        System.out.println(localoffers.size());






    }
}
