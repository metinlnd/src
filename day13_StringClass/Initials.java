package day13_StringClass;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        System.out.println(" enter your  firs name");
        Scanner input= new Scanner(System.in);

        String firstName= input.nextLine();
        System.out.println(" last name");
        String lastName= input.nextLine();

       char f= firstName.charAt(0);
       char l= lastName.charAt(0);
       String initial=""+ f+l;
 input.close();
        System.out.println("initial = " + initial);




    }
}
