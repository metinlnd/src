package day37_Scrum;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, String jobtitle, String companyname, int id, double salary) {
        super(name, age, gender, jobtitle, companyname, id, salary);
    }





    public void fixbugs(){
        System.out.println(Jobtitle+"Develpler fixbudgs");
    }
}
