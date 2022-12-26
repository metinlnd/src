package day28_ArrayList;

public class StrongPassword2 {
    public static void main(String[] args) {
        String password=" cLdeo1990@";

        int countuppercase=0;
        int  countlowercase=0;
        int coungdigit= 0;
        int countSpecialChar= 0;


        for (int i = 0; i < password.length(); i++) {

            char each= password.charAt(i);

            if (Character.isUpperCase(each)){countuppercase++;}
            else if (Character.isLowerCase(each)) {countlowercase++;}
            else if (Character.isDigit(each)) {coungdigit++;}
            else {countSpecialChar++;}

        }

boolean  hasUppercase= countuppercase>0;
 boolean hasLowercase= countlowercase>0;
 boolean hasDigit= coungdigit>0;
 boolean hasSpecialChar= countSpecialChar>0;

 boolean strongPassword= password.length()>=8&&!password.contains(" ")&&hasLowercase&&hasDigit&&hasUppercase;

        System.out.println(strongPassword);
    }
}
