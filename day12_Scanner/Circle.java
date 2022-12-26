package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" enter the radius");
        double radius = input.nextDouble();
        input.close();

        double area = radius * radius * 3.14;
        double perimetir = 2 * radius * 3.14;
        System.out.println("area = " + area);
        System.out.println("perimetir = " + perimetir);


    }
}
