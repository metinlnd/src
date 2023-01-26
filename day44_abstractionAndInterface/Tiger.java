package day44_abstractionAndInterface;

public class Tiger extends Animal implements WildAnimal {
    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "is eating tiger");
    }


   public void hunt(){
        System.out.println(getName()+ "hunts deer");}

}