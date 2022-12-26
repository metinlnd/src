package day36_Encapsulation.encapsulation.enci;

public class Animal {

    //its parent super class its must be inheretit.


    public String name, breed;
    public char gender;
    public String size;
    public String colour;
    public  int age;


    public void setInfo(String name, String breed, char gender, String size, String colour) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.size = size;
        this.colour = colour;
    }

public void eat(){System.out.println( name+"is eating");}

    public void drink(){System.out.println(name+"is drinking");}

    public  void move(){System.out.println(name+"is moving");}

    public  void sleep(){System.out.println(name+"is sleeping");}


    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                '}';
    }
}