package day33_Statics;

public class Student {

    public String name;
    public char gender;
    public int studentID;
    public char grade;


    public Student(String name) {
        this.name = name;
    }

    public Student(String name, char gender) {
        this(name);
        this.gender = gender;
    }


    public Student(String name, char gender, int studentID) {
        this(name,gender);
        this.studentID = studentID;
    }


    public Student(String name, char gender, int studentID, char grade) {
        this(name,gender,studentID);
        this.grade = grade;
    }
}




