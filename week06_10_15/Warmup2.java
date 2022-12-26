package week06_10_15;

public class Warmup2 {
    public static void main(String[] args) {

        String str= "java java java is everywhere is java";
        String wrd= "java";
        int counter= 0;
        while (str.contains(wrd)){counter++;

        str=str.replaceFirst(wrd, "");

        }
        System.out.println("counter = " + counter);














    }
}
