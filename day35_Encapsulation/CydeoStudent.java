package day35_Encapsulation;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age;
    public int batchnumber;
    public int groupnumber;

    public static String schoollname;

    public  String fieldofStudy;
     public static String programingLanguages;

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchnumber=" + batchnumber +
                ", groupnumber=" + groupnumber +
                ", fieldofStudy='" + fieldofStudy + '\'' +
                ", schooll='" + schoollname + '\'' +

                '}';
    }
    public static String sectercode;

    static{


        schoollname= "CYDEO";

        programingLanguages=" java";
         sectercode="WoodenSpoon";

    }


    public static void printschoolname(){

        System.out.println(schoollname+"");

    }

    public static void  printsecretcode(){
        System.out.println(sectercode+"is sectet code");
    }

    public void study(){
        System.out.println(name+"is studying");
    }

    public CydeoStudent(String name, char gender, int age, int batchnumber, int groupnumber, String fieldofStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchnumber = batchnumber;
        this.groupnumber = groupnumber;
        this.fieldofStudy = fieldofStudy;
    }
}
