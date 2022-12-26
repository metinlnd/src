package day21_Aray;

public class MaxNumber {
    public static void main(String[] args) {

/*
        int [] numbers= {10,20,30,40,50};

        int max= numbers[0];

        //  for (int i = 0; i < numbers.length; i++) {}fori
        // for (int i = numbers.length - 1; i >= 0; i--) {//forr}

        for (int i = 0; i < numbers.length; i++) {


            if(numbers[i]>max){max=numbers[i];}

        } System.out.println("max = " + max);*/




        int [] numbers= {10,20,30,40,50};
        
        int max= 10;
        for(int each:numbers){
           // System.out.println("each = " + each);
            
            if(each>max){ max= each;}
            

            
        } System.out.println("max = " + max);
        
        
        
        
        
    }
}
