package week07_10_2022;

public class Practice {
    public static void main(String[] args) {
        String message=" i love cats. I have a named COCO. My cats a very smart";
        String searched= " cat";
        String changed= " dog";
        while (message.contains(searched)){String htr= message.replace( "cat", "dog");
            System.out.println(htr);
        break;
        }

        while (message.contains(searched)) {

            int indexoffirstcat = message.indexOf(searched);
            int endoftheindexcat = message.indexOf(searched) + searched.length();

            message = message.substring(0, indexoffirstcat) + changed;  //message.substring(endoftheindexcat);
        }
        System.out.println("message = " + message);










        }







    }

