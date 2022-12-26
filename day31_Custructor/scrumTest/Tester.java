package day31_Custructor.scrumTest;

public class Tester {

public String name;
public  int employeeID;
public  String jopTitle;
public double salary;


    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jopTitle='" + jopTitle + '\'' +
                ", salary= £" + salary +
                '}';
    }

    public Tester(String name, int employeeID, String jopTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jopTitle = jopTitle;
        this.salary = salary;







    }


    public void smoketesting(){
        System.out.println(name+"is working");
    }

    public void creaticket(){
        System.out.println(name+"creting ticket");
    }






}
