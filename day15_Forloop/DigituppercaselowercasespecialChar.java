package day15_Forloop;

public class DigituppercaselowercasespecialChar {

    public static void main(String[] args) {

        String str="mike_tyson@gmail.com";

        String name= str.substring(0,str.indexOf("_"));
        String lastname= str.substring(str.indexOf("_")+1,str.indexOf("@"));
        String restof= str.substring(str.indexOf("@"));
        System.out.println(lastname+""+name+ restof);





























    }
}
