package OOPS.Constructors;

import java.util.Scanner;

class Mobile {
    String brand;
    int price;

    
    Mobile() {
        brand = "Samsung";
        price = 15000;
    }

    
    Mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    void show() {
        System.out.println("Brand: " + brand + ", Price: " + price);
    }
}

public class MobileChoiceDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Which mobile do you want to enter data for?");
        System.out.println("Mobile 1");
        System.out.println("Mobile 2");
        int choice = sc.nextInt();
        sc.nextLine();

        Mobile m1;
        Mobile m2;

        if (choice == 1) {
            System.out.print("Enter Mobile Brand: ");
            String brand = sc.nextLine();

            System.out.print("Enter Mobile Price: ");
            int price = sc.nextInt();

            m1 = new Mobile(brand, price); 
            m2 = new Mobile();             

        } else{
            System.out.print("Enter Mobile Brand: ");
            String brand = sc.nextLine();

            System.out.print("Enter Mobile Price: ");
            int price = sc.nextInt();

            m2 = new Mobile(brand, price); 
            m1 = new Mobile();         

        }

        System.out.println("\n--- Mobile Details ---");
        System.out.print("Mobile 1 -> ");
        m1.show();

        System.out.print("Mobile 2 -> ");
        m2.show();
    }
}
