package day17_LoopPractice;

import java.util.Scanner;

public class WhileloopPractice {
    public static void main(String[] args) {

        //username: "cydeo"
        //password: "cydeo123"

 int attemp = 3;//
        String username = "Cydeo";
        String Password = "Cydeo123";
        Scanner scan = new Scanner(System.in);

        {
            System.out.println(" please enter your username");

            String pass1 = scan.next();
            System.out.println(" enter your password");
            String pass2 = scan.next();

            if (pass1.equals("Cydeo") && pass2.equals("Cydeo123")) {
                System.out.println(" you logged in");
            }


            while (!(pass1.equals("Cydeo") && pass2.equals("Cydeo123")) && attemp > 0) {
                {
                    System.out.println(" blocked"); attemp--;
                }
            }


        }

    }

    }
