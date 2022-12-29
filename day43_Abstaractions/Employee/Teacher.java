package day43_Abstaractions.Employee;

public final class Teacher extends Employee{
    public Teacher(String name, int age, char gender, int id, String jobtitle, double salary) {
        super(name, age, gender, id, jobtitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ "is working in teacher class");

    }

    @Override
    public void sleep() {
        System.out.println(getName()+"sleeping in teacher class");

    }
}
