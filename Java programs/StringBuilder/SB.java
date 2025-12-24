package StringBuilder;

public class SB {
    public static void main(String[] args) {
         StringBuilder SB = new StringBuilder("Vikash");
         System.out.println(SB);

         //Try to print a Char at any index
         System.out.println(SB.charAt(3));

         //Set a new Char at any index
         SB.setCharAt(1, 'I');
         System.out.println(SB);

         // Insert at any index
         SB.insert(0, 'A');
         System.out.println(SB);

         //Delete (staring index , and Ending indext the char is deleted befor ending index)
         SB.delete(0, 1);
         System.out.println(SB);

         SB.append("A");
         System.out.println(SB);
    }
   
    
    
}
