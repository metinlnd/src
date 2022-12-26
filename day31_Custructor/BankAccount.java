package day31_Custructor;

public class BankAccount {


    public String bankholder;
    public int accountNumber;
    public double balance;

    public String toString() {
        return "BankAccount{" +
                "bankholder='" + bankholder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';


    }


    public void setinfo(String bankholder, int accountNumber) {
        this.bankholder = bankholder;
        this.accountNumber = accountNumber;

    }


    public void checkbalance(){
        System.out.println("your available balance is;"+balance);}


    public  void deposit(double amount){if(amount<=0)
    { System.out.println("depositing amount can not be zero or negative");}
    balance+= amount;}

    public  void withdrawn(double amount){
        if (amount>balance){
            System.out.println("insufficient balance");}

        if (amount<=0){
            System.out.println("withdrawn can not be negative");
            return;}
        balance-=amount;}


}


