package day19_Loop;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

      while (true) {

          System.out.println(" enter the number");

          int num = scan.nextInt();

          if (num % 2 == 0) {
              System.out.println(" even");

          } else {
              System.out.println(" odd");

              System.out.println("would you enter another number(yes or no)");
              String ans = scan.next();
              if (!(ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("no"))) {
                  System.out.println(" invalid entry System.exit(status 0)");
                  System.exit(0);
              }
              if (ans.equalsIgnoreCase("no")) {
                  break;
              }


          }


      }

    }
}
