package day21_Aray;

public class ForEachLoop {
    public static void main(String[] args) {

        int [] number= {10,2,5,5,8,9,9,7,5,2};
        for (int i = 0; i < number.length; i++) {
            int eachnumber= number[i];

            System.out.println(eachnumber);
        }

for (int  each:number){
    System.out.println("each = " + each);
}









    }
}
