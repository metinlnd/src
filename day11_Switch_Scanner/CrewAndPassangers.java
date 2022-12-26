package day11_Switch_Scanner;

public class CrewAndPassangers {
    public static void main(String[] args) {


        int crewAndPasssager = 100;
        String result = "";

        boolean validnumber= crewAndPasssager==100||crewAndPasssager==50||crewAndPasssager==75;

        if (validnumber){if (crewAndPasssager==100){result="20 crew, 70 passanger";}
        else if (crewAndPasssager==50) {result="30 crew, 70 passanger";}
        else {result="20 crew, 40 passanger";}}
        else {result="invaild number";}



            System.out.println(result);
        }


    }

