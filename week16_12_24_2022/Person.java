package week16_12_24_2022;

public class Person {


    private String name;

    final public String birthday;

    public Person(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
