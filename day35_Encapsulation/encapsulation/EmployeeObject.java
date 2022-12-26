package day35_Encapsulation.encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1= new Employee("TATINA",'F',23,23000);

        System.out.println(employee1);

     employee1.setName("metin");

        System.out.println(employee1);



        Employee employee2= new Employee("mahmut",'f',22,2100);


        employee2.setSalary(employee2.getSalary()+2000);

        System.out.println(employee2.getSalary());


        System.out.println(employee2.getGender());

    }
















}
