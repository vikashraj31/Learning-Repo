package Package;

 class BankInfo {
   public String name;
}


public class Bank {
    public static void main(String[] args) {

        BankInfo b1 = new BankInfo();   // object creation
        b1.name = "SBI";               // assigning value

        System.out.println("Bank Name: " + b1.name);
    }
}
