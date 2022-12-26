package day08_IdentifyNumber;

public class SingleStament {

    public static void main(String[] args) {
        int number = 301;
         boolean evennumber = number % 2 == 0;
         boolean oddnumber = !evennumber;
         if(evennumber) {

             System.out.println(number + "is even number");
         }

             if(oddnumber){

                 System.out.println(number + "is odd number");


             }
// positive negative or zero
             int n = 200;

             boolean positive = n >0;
             boolean negative= !positive;
             boolean zero = n ==0;
              if (positive){

                  System.out.println( n +""+"is a positive number");

              }
               if (negative){
                   System.out.println(n +""+"is a negative number");
               }

            if ( zero ){
                System.out.println(n +""+"is a zero number");


            }


        System.out.println(" -------------------------------------");

            if(n>0){
            System.out.println("positive = " + positive);
        }
        if(n==0){
            System.out.println("zero = " + zero);}
        if(n<0){
            System.out.println("negative = " + negative);
        }




             
             
             
         }
         
         
        
        
        
        
        
        
        
    }
    
    
    
    
    
    

