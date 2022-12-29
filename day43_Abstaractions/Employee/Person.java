package day43_Abstaractions.Employee;

public abstract class Person {
    private String name;
    private int age;
    private char gender;


    public abstract void sleep();

public void eat(){
    System.out.println("eating baklava");}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
      if(age<0){throw new RuntimeException("invalid age"+age); }

      this.age=age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
