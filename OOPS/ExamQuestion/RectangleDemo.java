package OOPS.ExamQuestion;

import java.util.*;

class Rectangle {

    int L;
    int B;
    int area;
    int perimeter;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter L and B");
        L = sc.nextInt();
        B = sc.nextInt();
    }

    void calculate() {
        area = L * B;
        perimeter = 2 * (L + B);
    }

    void display() {
        System.out.println("Area is " + area);
        System.out.println("Perimeter is " + perimeter);
    }
}

public class RectangleDemo {
    public static void main(String[] args) {

        Rectangle R = new Rectangle();
        R.read();
        R.calculate();
        R.display();
    }
}
