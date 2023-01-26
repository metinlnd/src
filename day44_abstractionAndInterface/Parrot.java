package day44_abstractionAndInterface;

public class Parrot extends Animal implements Playable,Flayable{
    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " parrot is eating simit");

    }

    public void play(){
        System.out.println(getName()+"parrot is playing");
    }

    @Override
    public void fly() {
        System.out.println(getName()+"fly 2 km hige");

    }
}
