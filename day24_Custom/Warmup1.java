package day24_Custom;

public class Warmup1 {
    public static void main(String[] args) {

    initial("metin","yilmaz");
domain("cydeo@gmail.com");

        String[] emails= { "metin@gmail.com","yilmaz@yahoo.com","mustafa@mail.com"};

        for (String each : emails) {

            domain(each);}

domain(emails[2]);

nameofthemonth(1);

nameOfTheDay(1);

initial1("metin", "yilmaz");

    }

    public static void initial1(String firstname, String lasname){

        String initialw="";

     initialw = (firstname.charAt(0)+""+lasname.charAt(0));
        System.out.println(initialw.toUpperCase());


    }















        public static void initial(String firstName, String lastName){
        String initial= firstName.charAt(0)+"."+lastName.charAt(0);
        initial=initial.toUpperCase();



        System.out.println(initial);



    }

        public static void  domain(String email){

      String domain= email.substring(email.indexOf('@')+1,email.lastIndexOf('.'));
    System.out.println(domain);




}

        public static void nameofthemonth(int number){

        String name="";

        if (number>=1 && number<=12){

             if(number==1){
                System.out.println("jan");
            }

            System.out.println(name);
        }
        else {System.out.println("invalid number");}





 }


        public static void nameOfTheDay(int number){

            String name="";

        name=(number==1)?"monday":(number==2)?"tue":"jd";

            System.out.println(name);


        }






















}
