package week16_12_24_2022.expections;

public class RunTimeExpections  {

    public static void main(String[] args) {

        try {
            for (int i = 0; i >=0; i--) {//ctrl+alt+T
                System.out.println(60/i);

            }
        } catch (Exception e) {//e.message
          e.getMessage();
        }


    }
}
