package day43_Abstaractions.Employee;

public class EmployeeObject {
    public static void main(String[] args) {

          //  Person person= new Person("METIN",12,'F') ;  ITS ABSTRACT CLASS


      //  Employee employee= new Employee() ITS ALSO ABRTRACT YOU CNA NOT CREAT OBJECT

        Tester tester= new Tester("me",12,'f',2155,"senior",12500);

        System.out.println(tester);

        tester.work();
        tester.sleep();
        tester.eat();
        tester.bugreport();

    }
}
