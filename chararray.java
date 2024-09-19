public class chararray {

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        char charToRemove = 'o';

        String result = popChar(inputString, charToRemove);

        System.out.println("Original String: " + inputString);
        System.out.println("String after removing '" + charToRemove + "': " + result);
    }

    public static String popChar(String str, char ch) {
        // Convert the string to a char array
        char[] charArray = str.toCharArray();

        // Create a StringBuilder to store the modified string
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the array
        for (char c : charArray) {
            // Add the character to the result if it is not equal to the specified character to remove
            if (c != ch) {
                result.append(c);
            }
        }

        // Convert StringBuilder back to String and return
        return result.toString();
    }
}

