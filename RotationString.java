
public class RotationString {
    public static boolean isRotation(String s1, String s2) {
        // Check if lengths are different, if so, they can't be rotations
        if (s1.length() != s2.length()) {
            return false;
        }
        
        // Concatenate s1 with itself
        String concatenated = s1 + s1;
        
        // Check if s2 is a substring of concatenated string
        return concatenated.contains(s2);
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "deabc";

        boolean result = isRotation(s1, s2);
        System.out.println("Is '" + s2 + "' a rotation of '" + s1 + "'? " + result); // Output: true
    }
}
