package week13_12_03_2022;

public class Products {
    public String name;
    public double price;
    public final int quatntity=100;


    public static int  eat(int a){
       return a*a;
    }

    public Products(String name, double price, int quatntity) {
        this.name = name;
        this.price = price;
        //this.quatntity = quatntity;
    }


    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quatntity=" + quatntity +
                '}';
    }

    public static void main(String[] args) {

        Products products1= new Products("metin",12555,55);


        System.out.println(products1);


        System.out.println(eat(2));




    }












}
