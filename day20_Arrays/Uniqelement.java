package day20_Arrays;

public class Uniqelement {
    public static void main(String[] args) {

        String[] words = {"java", "java", "c#", "python", "python"};

        String element = words[0];
        int frequency = 0;

        for (int j = 0; j < words.length; j++) {


            for (int i = 0; i < words.length; i++) {


                if (words[i].equals(element)) {
                    frequency++;
                }


                if (frequency == 1) {System.out.println(element);}
            }



        }
    }
}