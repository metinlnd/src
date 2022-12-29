package day43_Abstaractions.Employee;

public  final class Driver extends Employee {
    public Driver(String name, int age, char gender, int id, String jobtitle, double salary) {
        super(name, age, gender, id, jobtitle, salary);
    }

    @Override
    public void work() {
        System.out.println("is working in driver class");

    }

    @Override
    public void sleep() {
        System.out.println("is sleeping in driver class");

    }
}
