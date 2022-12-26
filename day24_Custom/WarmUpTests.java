package day24_Custom;

public class WarmUpTests {
    public static void main(String[] args) {

initial("metin","yilmaz");

domain("cydeo@gmail.com");
    }

public static void initial(String firstName, String lastName){


String initial= firstName.charAt(0)+""+lastName.charAt(0);
initial=initial.toUpperCase();

    System.out.println("initial="+initial );





}


public static void domain(String email){
        String domain= email.substring(email.indexOf("@"),email.lastIndexOf("."));

    System.out.println("domain="+ domain);

}





}




