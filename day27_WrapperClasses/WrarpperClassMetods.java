package day27_WrapperClasses;

public class WrarpperClassMetods {
    public static void main(String[] args) {

        String str= "123";
     int num=   Integer.parseInt(str);// retuns you int value
        System.out.println(num+1);
        System.out.println(str+1);




      int a1=   Integer.parseInt(str);

        System.out.println((a1 + 1));

        System.out.println("==========66666");
        String str2="1.2";

      double num2= Double.parseDouble(str2);

        System.out.println(num2+1);

int a= Integer.MAX_VALUE;
int b= Integer.MIN_VALUE;

        System.out.println(a);
        System.out.println(b);


        String str3= "true";

 boolean str4=Boolean.parseBoolean(str3);
        System.out.println(str4);

        System.out.println("==============================");


        String s2= "123";

      Integer s3=  Integer.valueOf(s2);
        System.out.println(s3);

        System.out.println("=========================");


        char ch1= '0';

        boolean r2= Character.isDigit(ch1);

      boolean r3= Character.isLetter(ch1);
        System.out.println(r3);

boolean r5= Character.isLetterOrDigit(ch1);
        System.out.println(r5);


        System.out.println("==========================================");




        String s= "123";

        int sum= 0;


        for (char each : s.toCharArray()) {

            if(Character.isDigit(each)){sum+= Integer.parseInt(""+each);}

        } System.out.println(sum);


    }
}
