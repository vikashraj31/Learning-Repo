package JavaExamQuestion;

//Illustrate multilevel inheritance with
//constructors: Plate(length,width), Box(length,width,height), WoodBox(length,width,height,thick)

class Plate {
    int length;
    int width;

    Plate(int l, int w) {
        length = l;
        width = w;
        System.out.println("Plate: " + length + " " + width);
    }
}

class Box extends Plate {
    int height;

    Box(int l, int w, int h) {
        super(l, w);
        height = h;
        System.out.println("Box: " + length + " " + width + " " + height);
    }
}

class WoodBox extends Box {
    int thick;

    WoodBox(int l, int w, int h, int t) {
        super(l, w, h);
        thick = t;
        System.out.println("WoodBox: " + length + " " + width + " " + height + " " + thick);
    }
}

public class MultiConstructor {
    public static void main(String[] args) {

        WoodBox wb = new WoodBox(10, 5, 4, 2);
    }
}