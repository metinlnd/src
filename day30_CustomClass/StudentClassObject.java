package day30_CustomClass;

import java.util.ArrayList;

public class StudentClassObject {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("metin", 'M', 39, 2210, 'A');

        System.out.println(student1);


        Student student2 = new Student();
        student2.setInfo("muhammed", 'M', 33, 4545, 'B');


        Student student3 = new Student();
        student3.setInfo("ali", 'M', 55, 7878, 'C');

        Student student4 = new Student();
        student4.setInfo("AYSA", 'F', 40, 4421, 'B');

        Student student5 = new Student();
        student5.setInfo("aliya", 'F', 32, 7741, 'A');


        Student[] students = {student1, student2, student3, student4, student5};
        for (Student student : students) {
            System.out.println(student);
        }


        System.out.println("========================================");

        ArrayList<Student> earlybirds = new ArrayList<>();//grade a
        ArrayList<Student> angrybirds = new ArrayList<>();

        for (Student student : students) {
            if (student.grade == 'A') {
                earlybirds.add(student);
            } else {
                angrybirds.add(student);
            }




        } System.out.println(earlybirds+"early");
        System.out.println(angrybirds);



    }
}