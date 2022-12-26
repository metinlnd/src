package day13_StringClass;

public class StringMetods2 {
    public static void main(String[] args) {

        String str= "Java is fun, I love learning JAVA";
       String str2= str.replace("Java", "pyhotn");
        System.out.println(str2);
 String emailadress= "johnSmith@gmail.com";
 String newemailadress= emailadress.replace( "gmail.com",    "yahoo.com");
        System.out.println("newemailadress = " + newemailadress);


        String str4= " dog dog dog dog dog dog dog";
        String str5= str4.replaceAll("dog","cat");
        System.out.println("str5 = " + str5);

        System.out.println(" ==========================");












    }
}
