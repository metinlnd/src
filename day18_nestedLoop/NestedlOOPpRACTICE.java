package day18_nestedLoop;

import java.util.Scanner;

public class NestedlOOPpRACTICE {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

 while (true){
        System.out.println(" enter your age");
        int age = scan.nextInt();
        while (!(age <= 1 || age <= 120)) {
            System.out.println("invalid entry .please re-enter your age");
            age = scan.nextInt();
        }


        System.out.println(" would you like to continue");
        String a = scan.next().toLowerCase();
        while (!(a.equals("yes") || a.equals("no"))) {
            System.out.println(" invalidd re enter");
        }

        if (a.equals("no")) {
            System.out.println("a = " + a);
            break;


        }
 } scan.close();
    }

}









