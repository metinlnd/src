package day24_Custom;

public class EligibleToVote {
    public static void main(String[] args) {
eligibleToVote(34,true);
oddOrEven(23);
reverse("ana");

String str ="ana";
 boolean anagram= reverse("ana").equalsIgnoreCase(str);
        System.out.println(anagram);






    }

 String sdf= "safj";


    public static void eligibleToVote(int age, boolean uScITIZEN) {
        if (age > 18 && uScITIZEN) {
            System.out.println("eligibletovot");

        } else {
            System.out.println("not eligilbe to vote");}
    return ;}

    public static void oddOrEven(int num){

        if(num%2==0){
            System.out.println("its even");}
        else {System.out.println("its odd");}

    }

 public static String reverse(String str){
     String result="";
     for (int i = str.length()-1; i >=0 ; i--) {
         result+=str.charAt(i);}
     System.out.println(result);
 return result;
     }

     }



