package day21_Aray;

public class Initilizitaion {
    public static void main(String[] args) {
        String[] names = {"metin usame", "emine yilmaz", "ece yilmaz"};

String[] reverse= new String[names.length-1];

        for (String each : names) {
            for (int i =names.length-1; i >0; i--) {

               reverse[(each.indexOf(0))] =names[i];

            }


        }

    }

}













       // for (String each : names) {
            
        /* String abv=   each.charAt(0)+""+each.charAt(each.indexOf(" ")+1);

            System.out.println("abv = " + abv);

        }

        System.out.println("======================================");

        for (String each : names) {
String reversed = "";

            for (int i = each.length()-1; i >=0; i--) {

                reversed+= each.charAt(i);


            }System.out.println("reversed = " + reversed);

        }
        
        
        
    }
}*/
