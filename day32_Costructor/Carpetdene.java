package day32_Costructor;

public class Carpetdene {



    public int width1, length1;


    public  double price1;

    public boolean isPersian1;


    public Carpetdene(int width1, int length1, double price1, boolean isPersian1) {
        this.width1 = width1;
        this.length1 = length1;
        this.price1 = price1;
        this.isPersian1 = isPersian1;

    }


    public double costTotal(){

      double totalprice=  width1*length1;


      if(isPersian1){totalprice+=200;}


      return totalprice;



    }


    public String toString() {
        return "Carpetdene{" +
                "width1=" + width1 +
                ", length1=" + length1 +
                ", price1=" + price1 +
                ", isPersian1=" + isPersian1 +
                ", totalprice=" + costTotal()+
                '}';
    }



}


