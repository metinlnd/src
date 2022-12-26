package day32_Costructor;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1= new Employee("metin");
        Employee employee2= new Employee("OSMAN",'F');
        Employee employee3= new Employee("ahmet",'M',"QA");
        System.out.println(employee1);
        System.out.println(employee2);

        System.out.println(employee3);


    }
}
