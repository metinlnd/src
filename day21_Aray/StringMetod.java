package day21_Aray;

import java.util.Arrays;

public class StringMetod {
    public static void main(String[] args) {
            String str= "Java";
            
             char[] chars= str.toCharArray();
            for(char each :str.toCharArray()){
                System.out.println("each = " + each);
                
            }
        System.out.print(Arrays.toString(chars));
        

        
        

        
    }
}
