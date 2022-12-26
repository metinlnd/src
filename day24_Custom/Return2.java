package day24_Custom;

public class Return2 {
    public static void main(String[] args) {
       //find max number 100&200
      int max=  maxNumber(100,200);
        System.out.println(max);

       // multip the max number 2

        int mutlip = max*2;
        System.out.println(mutlip);


      int a= maxNumber(200,400);

int b= a*2;

        System.out.println(b);

    }

    public static int maxNumber(int a,int b){

        int result= 0;

      if(a>b){result=a;}
      else {result=b;}

      return result;

    }




 }



