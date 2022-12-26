package day35_Encapsulation;

public class Person {


    public String name,language;
    public char gender;
    public int age;

    public Person(String name, String language, char gender, int age) {
        this.name = name;
        this.language = language;
        this.gender = gender;
        this.age = age;
    }
    public  static  boolean isHuman, planet, hasnose;
    public  static int numberofthefingers;



    static {

          boolean isHuman, planet, hasnose= true;

         int numberofthefingers=10;

         int numberOfthehead= 1;





    }



    public static void planetName(){

        System.out.println("Planet name is "+ planet);

    }


    public void eat(String food){

        System.out.println(name+"is eating"+food);


    }

    public void drink(String drink){

        System.out.println(name+"is drinking"+ drink);

            }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", planet=" + planet +
                '}';
    }





}
