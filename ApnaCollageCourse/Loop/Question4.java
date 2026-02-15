public class Question4 {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';

        for(int line = 1; line <=n; line++){
            for(int c = 1; c<line; c++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    
}
