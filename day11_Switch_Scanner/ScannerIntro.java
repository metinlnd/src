import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {


        Scanner input  = new Scanner(System.in);
        System.out.println(" enter a integer number");
        int num = input.nextInt();
        System.out.println(" enter a decimal number");
        double num2= input.nextDouble();

        input.close ();

        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);
        System.out.println(num2*num);














    }































}
