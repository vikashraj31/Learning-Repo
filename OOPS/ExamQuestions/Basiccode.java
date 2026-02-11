package OOPS.ExamQuestions;

import java.util.*;

class Student {
    String Name;
    int Roll;
    String Section;
    String Branch;

    Student(String name, int roll, String section, String branch) {
        this.Name = name;
        this.Roll = roll;
        this.Section = section;
        this.Branch = branch;
    }
}

public class Basiccode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Roll:");
        int roll = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.println("Enter Section:");
        String section = sc.nextLine();

        System.out.println("Enter Branch:");
        String branch = sc.nextLine();

        Student S1 = new Student(name, roll, section, branch);

        System.out.println("Student Created Successfully");
    }
}
