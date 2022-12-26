package day13_StringClass;

public class Emaildomain {
    public static void main(String[] args) {
        String emaildomain = "Cydeo.School@Gmail.com";
        //domain:
      String begeningindex= String.valueOf(emaildomain.indexOf("@")+1);
        System.out.println("begeningindex = " + begeningindex);
        int endofindexnumber= emaildomain.lastIndexOf(".");
        String domainemailadress= emaildomain.substring(Integer.parseInt(begeningindex),endofindexnumber);
        System.out.println("domainemailadress = " + domainemailadress);

        System.out.println("=================================");
 String str1= "java is fun, java is cool";
 String S1= str1.substring(0,11);
        System.out.println("S1 = " + S1);
         int beg= str1.indexOf("j");
         int end= str1.indexOf("c");
         String subtringjava= str1.substring(beg,end);
        System.out.println("subtringjava = " + subtringjava);




















    }
}
