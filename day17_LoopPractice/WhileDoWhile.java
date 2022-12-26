package day17_LoopPractice;

public class WhileDoWhile {
    public static void main(String[] args) {

      /*  String str= "java java java phyton";

        int frecuensy= 0;

        while (str.contains("java")){str= str.replaceFirst("java", "");frecuensy++;}
        System.out.println("frecuensy = " + frecuensy);


        System.out.println(" =========================================");*/

/*String sent=" cat cat cat cat ";

int containt= 0;

while (sent.contains("cat")){sent=sent.replaceFirst("cat","");// do not forget to assing new stirngs
    containt++;}
        System.out.println("containt = " + containt);*/

String s= "java java java java photon photon";
 int countjava= 0;
 int countphoton=0;

 while (s.contains("java")||s.contains("photon"))
 {  if(s.contains("java")){s=s.replaceFirst("java","");countjava++;} if (s.contains("photon")){s= s.replaceFirst("photon","");}{countphoton++;} ;}
        System.out.println("countphoton = " + countphoton);

        System.out.println("countjava = " + countjava);











    }
}
