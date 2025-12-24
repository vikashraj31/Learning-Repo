package Strings;

public class concatentation {
    public static void main(String[] args) {
        String first = "Vikash";
        String last = "Raj";

        String fullname = first + " " + last;
        System.out.println("Full name: " + fullname);
        System.out.println(fullname.length());

        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }

    }

}
