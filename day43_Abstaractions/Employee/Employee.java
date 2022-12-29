package day43_Abstaractions.Employee;

public abstract class Employee extends Person {

// abstract child does not override
    private final int id;
    private String jobtitle;
    private double salary;

    public Employee(String name, int age, char gender, int id, String jobtitle, double salary) {
        super(name, age, gender);

        if(id<0){throw new RuntimeException("invalid id");}
        this.id = id;
        this.jobtitle = jobtitle;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();

    public String toString() {
        return "Employee{" +
                "name=" + getName() +
                "gender=" + getGender() +
                "id=" + id +
                ", jobtitle='" + jobtitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
