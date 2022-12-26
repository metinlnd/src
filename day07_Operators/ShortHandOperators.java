package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {

        int num1 = 5;
        System.out.println("num1 = " + num1);
        num1= 10;
        System.out.println("num1 = " + num1);


        String word = "Java programing";
        word = "diffuclt";

        System.out.println("word = " + word);

        String str = " wooden";
         str += "spoon"; // += means addition
        System.out.println(str);


        double num100 = 2.5;
        System.out.println("num100 = " + num100); //2.5

        num100 += 8; //10.5

        System.out.println("num100 = " + num100);

        double availenum_2 = 100.5;
        availenum_2 -= 199.5;
        System.out.println(availenum_2); //300


         String soyismi = " yilmaz";
         soyismi +=" metin usame";
        System.out.println("soyismi = " + soyismi);



        //depositing money so you must call +=
        // withdrawning money you must use -=

        int depositngMoney = 200;
        depositngMoney *= 100; // it means that 100*200
         depositngMoney /= 2;


        System.out.println("depositngMoney = " + depositngMoney);//300








 double num3 = 3;
 num3 %=6;
        System.out.println("num3 = " + num3);

        int amount = 127;
        amount %=25;


        int insurance = 3500;
        insurance %=123;
        System.out.println("insurance = " + insurance);




    }






}
