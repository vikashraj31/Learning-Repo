package JavaExamQuestion;

//Write a class Box with data members length, width,
//height and a method volume(). Create Demo class to take input and print volume.

import java.util.Scanner;


class Box{
    int length;
    int width;
    int height;

    //Methor
    void volume(){
        Scanner sc = new Scanner(System.in); //This Scan all Input one by one

        System.out.print("Enter length: ");
        length = sc.nextInt();

        System.out.print("Enter width: ");
        width = sc.nextInt();

        System.out.print("Enter height: ");
        height = sc.nextInt();

        int volume = length * width * height;

        System.out.println("The Volume is " + volume);
    }
}

public class Demo {
    public static void main(String[] args) {

        Box object = new Box();
        object.volume();
    }
}
