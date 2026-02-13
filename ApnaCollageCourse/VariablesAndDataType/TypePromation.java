public class TypePromation {
    public static void main(String[] args) {


        char a = 'a';
        char b= 'A';
        int c = a-b;
        System.out.println(c);
        System.out.println(" ");


        short d =5;
        byte e =4;
        char f = 'c';

        // byte G = d+e+f;  Not possible but it is done by TypeCast
        byte G =(byte)(d+e+f);

        System.out.println(G);

        System.err.println();


        int z = 5;
        float y = 22.54f;
        long x = 33;
        double w = 22.33;

        double u = z+y+x+w;//Normal TypePromation

        //int u = (int) (z+y+x+w); Forcefull typepromation
        System.out.println(u);



    
    }
    
}
