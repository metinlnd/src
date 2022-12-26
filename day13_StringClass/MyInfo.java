package day13_StringClass;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your age");

        int age = input.nextInt();
        System.out.println(" please enter your gender");
input.nextLine();
        String gender= input.nextLine();
        System.out.println(" please enter full name");
        String fullname= input.nextLine();
        System.out.println(" please enter your phoen number");
        long phonenumber=input.nextLong();
        System.out.println("plese enter school name");
      input.nextLine();
        String schoolName= input.nextLine();
        System.out.println(" please enter c ity name");
        String cityname = input.nextLine();
        System.out.println(" state name");
        String statename= input.next();
        System.out.println(" buliding number");
        int bulidinnumber = input.nextInt();
        System.out.println(" stereet name");
        input.nextLine();
        String steretname= input.nextLine();

input.close();


        System.out.println( "ADRES: \n\t"+ bulidinnumber+""+steretname+"\n\t"+cityname+",");
        
        
        
        
        
        
        
        
    }
}
