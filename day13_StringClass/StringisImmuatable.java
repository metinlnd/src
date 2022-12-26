package day13_StringClass;

public class StringisImmuatable {
    public static void main(String[] args) {
            String str= "wooden spoon";
            str.toUpperCase();// WOODEN SPOON

        str= str.toUpperCase();
        System.out.println("str = " + str);



 int lenth= str.length();
        System.out.println("lenth = " + lenth);
        char lastindex= str.charAt(lenth-1);

        System.out.println("lastindex = " + lastindex);














    }




}
