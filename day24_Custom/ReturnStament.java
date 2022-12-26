package day24_Custom;

public class ReturnStament {
    public static void main(String[] args) {

// create a function that calculate the grade

        /* check the grade if a == excelent, b == great ...*/
          String str= grade(85);


        System.out.println(str);


    }

    public static String grade(int score) {

        String result = "";


        if (score < 0 || score > 100) {result = "invalid";}
        else {result = (score >= 90) ? "A" : (score >= 80) ? "B"
                    : (score >= 70) ? "C" : (score >= 60) ? "D" : "E";}

return result;
    }


}

