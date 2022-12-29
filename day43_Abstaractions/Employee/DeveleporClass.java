package day43_Abstaractions.Employee;

public final class DeveleporClass extends Employee{


    public DeveleporClass(String name, int age, char gender, int id, String jobtitle, double salary) {
        super(name, age, gender, id, jobtitle, salary);
    }

    @Override
    public void work() {
        System.out.println("he is working on developre class");

    }

    @Override
    public void sleep() {
        System.out.println("he is sleeping on developrer class");

    }

    public void unitTest(){
        System.out.println("he is testing in develeopre class ");
    }
}
