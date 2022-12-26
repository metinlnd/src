package day30_CustomClass;

public class Duck {

    public String name;
    public String breed;
    public  String coloru;
    public char gender;
     public  boolean isfat;
     public int year;
     public double price;

      public void eat(){
          System.out.println(name+"eating");
      }
     public void price(){

          if(price>100){
              System.out.println("its so expendine");
     }else {
              System.out.println("its normal");
          }}


    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", coloru='" + coloru + '\'' +
                ", gender=" + gender +
                ", isfat=" + isfat +
                ", year=" + year +
                ", price=£" + price +
                '}';
    }

    public Duck(String name, String breed, String coloru, char gender, boolean isfat, int year, double price) {
        this.name = name;
        this.breed = breed;
        this.coloru = coloru;
        this.gender = gender;
        this.isfat = isfat;
        this.year = year;
        this.price = price;
    }
}
