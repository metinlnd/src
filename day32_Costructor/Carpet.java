package day32_Costructor;

public class Carpet {

 public  double width, length, unitPrice;
 public boolean isPersian;


    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }


    public String toString() {
        return "CustomClassWarmUp{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalprice=£" + calcost() +
                                '}';
    }

    public double  calcost(){double totalprice= (width*length)*unitPrice;

    if(isPersian){totalprice+=200;}
    return totalprice;}



}
