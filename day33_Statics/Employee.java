package day33_Statics;

public class Employee {


    public  String name;
public  double salary;
public static boolean isHuman= true;


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
