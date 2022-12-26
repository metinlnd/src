package day13_StringClass;

public class StringMetods {
    public static void main(String[] args) {

        String word = "Cydeo";

        char thirdcharacter = word.charAt(2);
       // char tenthcharacter= word.charAt(9);
        // System.out.println("tenthcharacter = " + tenthcharacter);
        System.out.println("thirdcharacter = " + thirdcharacter);

        System.out.println(" ----------------------------------");


        String str1= "123";

int totalnumberofcharcter = str1.length();

        System.out.println("totalnumberofcharcter = " + totalnumberofcharcter);


        char lastcharcter= str1.charAt(str1.length()-1);// char starts with 0 BUT LENGTH STARTS WITH 1.
        System.out.println("lastcharcter = " + lastcharcter);

        System.out.println(" ==============================================");


        String nameoftheday= "monday";

        int  num1= nameoftheday.length();
        char num2= nameoftheday.charAt(1);
        System.out.println(num2+""+num1);
        System.out.println(" =----------------------=");

        String str = "        bath 25     ";
      str = str.trim();
        System.out.println("str = " + str);


        String st3 = "cydeoo java programing";
        int n4= st3.indexOf("av");
        System.out.println("n4 = " + n4);
        int n5= st3.lastIndexOf("av");













    }
}
