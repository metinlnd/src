package day44_abstractionAndInterface;

public abstract class Animal {

    private String name;
    private  final String breed;
    private final char gender;
    private int age;
    private String size;
    private final String color;

    public final static boolean canBreath=true;// static means just 1 copy final means never changed.

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        this.breed = breed;
        if(!(gender=='M'||gender=='F')){throw new RuntimeException("invalid gender:"+ gender);}
        this.gender = gender;
        setAge(age) ;
        setSize(size) ;
        this.color=color;
    }
// static means no instants just o1 copy for all.final never change.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){throw new RuntimeException("invalid name");}

        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

public final void drink(){
    System.out.println(name+" is drinking");
}

public abstract void eat();//final and abstract never can be used in a same line.public final abstrac (){} gibi

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}