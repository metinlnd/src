package day17_LoopPractice;

public class DigitLadderSpecial {
    public static void main(String[] args) {
        String str =" Cydeo12345School!@WoodenSpoon";
        String digits= "";//123456
        String letters="";//afadfdgfg
        String specilachars="";//@!
        for (int i = 0; i < str.length(); i++) { char ch= str.charAt(i);
            if(ch>='0'&& ch<='9'){ digits+= ch;} 
            else if (ch>='A'&&ch <='Z'){ letters+= ch;}
            else if (ch>='a'&&ch<='z') {letters+=ch;}
            else { specilachars+= ch;}}

        System.out.println("specilachars = " + specilachars);
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
















    }
}
