package day15_Forloop;

public class StringClass4 {
    public static void main(String[] args) {
        String str = "";
       boolean r= str.isEmpty();
        System.out.println("r = " + r);

        boolean s = str.isBlank();
        System.out.println("s = " + s);
        System.out.println(" =========================================");


        String s1= "METIN";
        String s2="metin";
        boolean s3=s1.equals(s2);
        boolean s4 = s1.equalsIgnoreCase(s2);
        System.out.println(""+s3+s4);
        System.out.println("s4 = " + s4);

        System.out.println(" = ---------------------------------------");

        String sentente = " my Family is rich";
        boolean str4= sentente.toUpperCase().contains("R");
        System.out.println("str4 = " + str4);


        String n1= "I love JAVA";
        String n2= "java";
        String n3= String.valueOf(n1.toUpperCase().contains("JAVA"));
               String n4= String.valueOf(n1.compareToIgnoreCase("java"));
        System.out.println("N4 = " + n4);












    }
}
