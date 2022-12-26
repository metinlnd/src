package Week12_12_1221;

public class Employee {

 public    String name;
    public double salary;
    public int id ;

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    public Employee(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }


    public void eat(){
        System.out.println(name);
    }

}
