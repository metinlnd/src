package day43_Abstaractions.Employee;

public final class Tester extends Employee{
    public Tester(String name, int age, char gender, int id, String jobtitle, double salary) {
        super(name, age, gender, id, jobtitle, salary);
    }

    @Override
    public void work() {
        System.out.println("he is working tester class");

    }

    @Override
    public void sleep() {
        System.out.println("he is sleeping in tester class");



    }


    public void bugreport(){

        System.out.println("creating bug reports3");

    }

}
