package day31_Custructor;

public class CapitalOne {
    public static void main(String[] args) {



        BankAccount account1= new BankAccount();
        account1.setinfo("ahmet ozok",12345676);

        System.out.println(account1);

        account1.deposit(1000);
        account1.checkbalance();

        account1.withdrawn(900);
        account1.checkbalance();

        System.out.println("++++++++++++++++++++++");

 BankAccount account2=new BankAccount();
 account2.setinfo("aysa yilmaz",123564);

 account2.deposit(200);
 account2.checkbalance();













    }
}
