package day30_CustomClass;

public class Dog {
    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;


    public String eat(){


        System.out.println(name+"is eating");
    return  null;}

    public Dog(String name, String breed, int age, char gender, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.size = size;
        this.color = color;
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public  void bark(){
        System.out.println(name+"is barking");









    }

}
