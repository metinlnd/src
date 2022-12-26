package day20_Arrays;

public class MinunumNumber {
    public static void main(String[] args) {
        
        int [] number= {5,8,1,5,4,6,2,7};
        
        int minunum =number[0];
        

        for (int i = 0; i < number.length; i++) {

            if(number[i]<minunum){   minunum= number[i];}
            
        } System.out.println("minunum = " + minunum);
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
