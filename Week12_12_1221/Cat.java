package Week12_12_1221;

public class Cat {

    public String name;

    public String colour;

    public int year;

    public char gender;


    public void eat() {
        System.out.println(name+"eatjing");

    }

    public void drink() {
        System.out.println(name+"dringking");
    }


    public Cat(String name, String colour, int year, char gender) {
        this.name = name;
        this.colour = colour;
        this.year = year;
        this.gender = gender;
    }

    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", year=" + year +
                ", gender=" + gender +

                '}';
    }
}


