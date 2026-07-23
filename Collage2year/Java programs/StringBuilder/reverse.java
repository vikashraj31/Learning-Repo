package StringBuilder;

public class reverse {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Vikash");

        System.out.println("Original string: " + sb);
        
        // To Reverse the string 
        for(int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        
        System.out.println("Reversed string: " + sb);
    }
}