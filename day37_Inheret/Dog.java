package day37_Inheret;

public class Dog extends Animal {


    public Dog(String name, String breed, char gender, String size, String colour, int age) {
        super(name, breed, gender, size, colour, age);
    }

    public void strach (){System.out.println(name+"is stracting");}



}
