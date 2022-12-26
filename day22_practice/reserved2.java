package day22_practice;

public class reserved2 {
    public static void main(String[] args) {


        String sentence= "I love java";

        String [] str= sentence.split(" ");
String reserved="";

        for (int i =str[1].length()-1 ; i >= 0; i--) {

            reserved+=str[1].charAt(i);

        }sentence= sentence.replaceFirst(str[1], reserved);
        System.out.println(sentence);




    }
}
