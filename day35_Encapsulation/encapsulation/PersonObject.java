package day35_Encapsulation.encapsulation;

public class PersonObject {

    public static void main(String[] args) {


        Person p1 = new Person();
p1.setAge(-200);
p1.setName("daniel");


        System.out.println(p1.getName()+":"+p1.getAge());


    }
}