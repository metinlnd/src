package Week08_29_10_2022;

public class Calculator {
    public static void main(String[] args) {
        char operator = '*';
 double num1 = 100.5;
 double num2 = 34.5;
  boolean valid = operator== '+'|| operator=='-'||operator=='/'|| operator=='*';


  if(valid) {
      switch (operator) {

          case '+':
              System.out.println(num1+num2);
              break;
          case '-':
              System.out.println(num1-num2);
              break;

          case '/':
              System.out.println(num1/num2);
              break;
          default:
              System.out.println(num1*num2);



      }




  } else System.out.println(" invalid");




    }

}
