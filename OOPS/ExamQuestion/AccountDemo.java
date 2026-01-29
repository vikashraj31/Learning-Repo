package OOPS.ExamQuestion;
//Write a class Account with acc_no and balance,
//methods input() and disp(). Create subclass Person with name and aadhar_no and override disp().

import java.util.*;

class Account {
    int acc_no;
    int balance;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number and balance");
        acc_no = sc.nextInt();
        balance = sc.nextInt();
    }

    void disp() {
        System.out.println("Account No: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    long aadhar_no;

    void input() {
        super.input();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name and aadhar number");
        name = sc.next();
        aadhar_no = sc.nextLong();
    }

    void disp() {
        super.disp();
        System.out.println("Name: " + name);
        System.out.println("Aadhar No: " + aadhar_no);
    }
}

public class AccountDemo {
    public static void main(String[] args) {

        Person P = new Person();
        P.input();
        P.disp();
    }
}
