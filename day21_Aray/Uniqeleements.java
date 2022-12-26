package day21_Aray;

public class Uniqeleements {
    public static void main(String[] args) {
        String[] words = {"java", "java", "c#", "python", "python"};


        for (String element  : words) {

            int count= 0;
            for (String each : words) {

                if (each.equals(element)) {
                    count++;

                }

            }
            //System.out.println(element);
            if(count==1){System.out.println("element = " + element);
            }

        }








    }
}
