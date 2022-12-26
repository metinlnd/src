package day31_Custructor;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {


        Student student1 = new Student("hulya", 26, 'F', 'B', 12);
        Student student2 = new Student("ali", 23, 'M', 'A', 123);
        System.out.println(student1);


        ArrayList<Student>students= new ArrayList<>(Arrays.asList(student1,student2));

    }

}
