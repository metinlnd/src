package day46_Polymorphism;

public class EncapsulationRE {


    private String booktitle;
    private  final String publishdate;

    public EncapsulationRE(String publishdate) {
        this.publishdate = publishdate;
    }

    public String getBooktitle(){

        return booktitle;

    }

    public void setBooktitle(){

        this.booktitle=booktitle;
    }






}
