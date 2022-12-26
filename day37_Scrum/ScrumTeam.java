package day37_Scrum;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {


    public ProductOwner PO;

    public BusinessAnaslyst BA;

    public ScrumTeam(ProductOwner PO, BusinessAnaslyst BA, ScrumMaster SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public ScrumMaster SM;

    public ArrayList<Tester>testers= new ArrayList<>();

    public ArrayList<Developer>developers= new ArrayList<>();





public void adTester(Tester tester){

    testers.add(tester);}




    public void addTesters(Tester[] testers){

    this.testers.addAll(Arrays.asList(testers));


    }



    public void removeTester(int id){
    testers.removeIf(p->p.Id==id);}


    public void addDeveloper(Developer developer){



    }


}
