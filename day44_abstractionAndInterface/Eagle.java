package day44_abstractionAndInterface;

public final class Eagle extends Animal implements WildAnimal,Flayable{
    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " eagle eating birds");

    }

    public void hunt(){
        System.out.println(getName()+"hunts snake");
    }


    @Override
    public void fly() {

    }
}
