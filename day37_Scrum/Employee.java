package day37_Scrum;

public class Employee extends Person{


    public Employee(String name, int age, char gender) {
        super(name, age, gender);
    }

    public String Jobtitle;

    public  String Companyname;
    public  int Id;
    public  double salary;

    public Employee(String name, int age, char gender, String jobtitle, String companyname, int id, double salary) {
        super(name, age, gender);
        Jobtitle = jobtitle;
        Companyname = companyname;
        Id = id;
        this.salary = salary;
    }

    public void Working(){
      System.out.println(name+"is working");
  }


    public String toString() {
        return "Employee{" +
                "Jobtitle='" + Jobtitle + '\'' +
                ", Companyname='" + Companyname + '\'' +
                ", Id=" + Id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
