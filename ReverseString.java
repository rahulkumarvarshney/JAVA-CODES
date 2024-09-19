import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String reversedString = reverseString(originalString);
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverseString(String str) {
        
        if (str == null || str.isEmpty()) {
            return str;
        }
        Scanner sc=new Scanner(System.in);
        String strr=sc.nextLine();

        StringBuilder reversed = new StringBuilder();

        
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }
}
