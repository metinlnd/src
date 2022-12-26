package week13_12_03_2022;

import day06_PrimitiveTypeCasting.LocalDate;

public class Teacher {

    public  String name,lastname;
    public char gender;
    public LocalDate dateofBirth;
    public int age;
    public long id;

    public Teacher(String name, String lastname, char gender, int age, long id) {
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
        this.id = id;

    }

    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender=" + gender +
                ", dateofBirth=" + dateofBirth +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
