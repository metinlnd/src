package day30_CustomClass;

public class Employee {
   public String name;
  public   int ID;
  public   char gender;
  public   String jobtitle;
  public   double salaary;
  public   boolean isFulltimeorParttime;

    public String toString() {
        return "CapitalOne{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", gender=" + gender +
                ", jobtitle='" + jobtitle + '\'' +
                ", salaary=" + salaary +
                ", isFulltimeorParttime=" + isFulltimeorParttime +
                '}';
    }


    public void setInfo(String name, int ID, char gender, String jobtitle, double salaary, boolean isFulltimeorParttime) {
        this.name = name;
        this.ID = ID;
        this.gender = gender;
        this.jobtitle = jobtitle;
        this.salaary = salaary;
        this.isFulltimeorParttime = isFulltimeorParttime;



    }

    public void work(){System.out.println(name+jobtitle+" is working");}



}
