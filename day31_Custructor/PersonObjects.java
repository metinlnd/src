package day31_Custructor;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonObjects {
    public static void main(String[] args) {
      Person person1=  new Person("daniel",'M',23);
        System.out.println(person1);


        Person person2= new Person("AHMAT",'M',12);






        Person person3= new Person("ahmed",'f',12);


        ArrayList<Person>personWihtAhmasd= new ArrayList<>(Arrays.asList(person3,person2,person1));

personWihtAhmasd.removeIf(person -> !person.name.equals("ahmad"));
        System.out.println(personWihtAhmasd);

    }
}
