package day31_Custructor.scrumTest;

public class MyScrumTeam {
    public static void main(String[] args) {
        //3 testers object

        Tester tester1=new Tester("metin",12345,"QA",50000);
        Tester tester2= new Tester("hulya",45537663,"ba",34000);
        Tester tester3=new Tester("metin1",123451,"QA1",500001);
        Tester tester4= new Tester("hulya1",455376631,"ba1",340001);


Tester [] testers={tester2,tester3,tester4};


        //4 developer object

        Developer developer1= new Developer("Metin",432223,"BA",23500);
        Developer developer2= new Developer("Metin1",4322231,"BA1",235001);
        Developer developer3= new Developer("Metin2",4322232,"BA2",235002);
        Developer developer4= new Developer("Metin3",43222313,"BA3",2350013);



        ScrumTeam scrum= new ScrumTeam("NIGARA","HUSEYIN","ALI",14);
scrum.addTester(tester1);

scrum.addDeveloper(developer1);



scrum.addDeveloper(developer1);







    }
}
