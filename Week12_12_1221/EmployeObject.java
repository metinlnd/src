package Week12_12_1221;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeObject {

    public static void main(String[] args) {

        Employee employee1= new Employee("metin",23500,12345);

        Employee employee2= new Employee("metin1",235004,123454);

        Employee employee3= new Employee("metin2",235001,123457);


   Employee[] employees={employee1,employee2,employee3};

   ArrayList<Employee> employee= new ArrayList<>();
   employee.addAll(Arrays.asList(employee1,employee2,employee3));

        for (Employee each : employee) {
            System.out.println(each.name+each.salary);

        }



  employee.removeIf(p->p.salary>123457);
        System.out.println(employee);







    }




}
