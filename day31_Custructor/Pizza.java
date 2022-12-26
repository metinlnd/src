package day31_Custructor;

public class Pizza {


    public char size;
    public  int numberofCheeseTopping, numberofPepperoniTopping;

    public Pizza(char size, int numberofCheeseTopping, int numberofPepperoniTopping) {
        this.size = size;
        this.numberofCheeseTopping = numberofCheeseTopping;
        this.numberofPepperoniTopping = numberofPepperoniTopping;
    }


    public double calulateCost(){
        double startingprice=(size=='S')? 10 :(size=='M')? 12:14;

        double totalprice= startingprice+(numberofCheeseTopping+numberofPepperoniTopping);
        return totalprice;




    }






    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberofCheeseTopping=" + numberofCheeseTopping +
                ", numberofPepperoniTopping=" + numberofPepperoniTopping +
                ", totalprice=£" + calulateCost() +
                '}';
    }
}
