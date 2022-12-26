package day31_Custructor;

public class Offer {













    public String location;
    public  String companyName;
    public String jobTitle;
    public double salaray;
    public boolean hasAbenefit,hasPTO,isWIFI,isFullTime;




    public String toString() {// for printing converting to string object 
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salaray=" + salaray +
                ", hasAbenefit=" + hasAbenefit +
                ", hasPTO=" + hasPTO +
                ", isWIFI=" + isWIFI +
                ", isFullTime=" + isFullTime +
                '}';


    }

    public void setinfo(String location, String companyName, String jobTitle, double salaray, boolean hasAbenefit, boolean hasPTO, boolean isWIFI, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salaray = salaray;
        this.hasAbenefit = hasAbenefit;
        this.hasPTO = hasPTO;
        this.isWIFI = isWIFI;
        this.isFullTime = isFullTime;
    }




}

