package week13_12_03_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class School {

    static ArrayList<Teacher> teachers = new ArrayList<>();


    static {

        Teacher teacher1 = new Teacher("metin", "yilmaz", 'F', 345, 11245877);

        Teacher teacher2 = new Teacher("metin1", "yilmaz4", 'F', 347, 11245875);

        Teacher teacher3 = new Teacher("metin2", "yilmaz2", 'F', 347, 11245872);


        Teacher teacher4 = new Teacher("metin3", "yilmaz1", 'F', 344, 11245871);


        teachers.addAll(Arrays.asList(teacher1, teacher2, teacher3, teacher4));

    }


    public static void main(String[] args) {

        System.out.println(teachers);

        ArrayList<Teacher> result = getTeachersNameStartWith("MI");

        System.out.println(result);

        ArrayList<Teacher> females = getTeachersByGender('F');
        System.out.println(females);

    }

    private static ArrayList<Teacher> getTeachersByGender(char gender) {
   ArrayList<Teacher>result= new ArrayList<>();


        for (Teacher teacher : teachers) {

            if(teacher.gender==gender){result.add(teacher);}

        }
        return result;



    }


    private static ArrayList<Teacher> getTeachersNameStartWith(String prefix) {

        ArrayList<Teacher> result = new ArrayList<>();
        for (Teacher teacher : result) {


            if (teacher.name.startsWith(prefix)) {
                result.add(teacher);


            }



        }return result;
    }
}