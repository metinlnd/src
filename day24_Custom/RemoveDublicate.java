package day24_Custom;

public class RemoveDublicate {
    public static void main(String[] args) {
String cd= "aaabbacbccedddg";


cd=removeDuplicate(cd);

        System.out.println(cd);
    }

public static String removeDuplicate(String str){

String result= "";

    for (int i = 0; i < str.length(); i++) {

        char each= str.charAt(i);
        if(! result.contains(""+each)){result+= each;}
    }



return result;


}


}
