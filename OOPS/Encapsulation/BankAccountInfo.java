package OOPS.Encapsulation;


class BankAccount {

    private float balance;     // hidden data
    private int accountNo;     // hidden data


    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    
    public int getAccountNo() {
        return accountNo;
    }

    public void setBalance(float balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance. Balance cannot be negative.");
        }
    }

    public float getBalance() {
        return balance;
    }

    void show (){
        System.out.println("Account Number: " + this.getAccountNo());
        System.out.println("Balance: " + this.getBalance());
    }
}

public class BankAccountInfo {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();

        b1.setAccountNo(12345);
        b1.setBalance(5000);

        BankAccount b2 =new BankAccount();

        b2.setAccountNo(24052557);
        b2.setBalance(999999);

        // System.out.println("Account Number: " + b1.getAccountNo());
        // System.out.println("Balance: " + b1.getBalance());

        b1.show();
        b2.show();
    }
}
