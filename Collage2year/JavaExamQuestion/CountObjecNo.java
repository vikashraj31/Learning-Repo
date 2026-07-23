package JavaExamQuestion;

// Program to count number of objects using static variable

class CountObject {

    static int count = 0;

    CountObject() {
        count++;
    }

    static void showCount() {
        System.out.println("Number of objects = " + count);
    }
}

public class CountObjecNo {
    public static void main(String[] args) {

        CountObject o1 = new CountObject();
        CountObject o2 = new CountObject();
        CountObject o3 = new CountObject();

        CountObject.showCount();
    }
}
