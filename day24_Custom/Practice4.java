package day24_Custom;

public class Practice4 {
    public static void main(String[] args) {


int a=frequency("asdjjdjd",'j');
        System.out.println(a);
    }


    public static int frequency (String  str, char ch){


        int count=0;

        for (char each : str.toCharArray()) {

            if(each==ch){count++;}

        }
        return count;



    }




}
