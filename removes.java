public class removes {

    public static String popChar(String str, char ch) {
        // Use StringBuilder for efficient string manipulation
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Append the character to the result StringBuilder if it's not the specified character
            if (currentChar != ch) {
                result.append(currentChar);
            }
        }

        // Convert the StringBuilder to a String and return
        return result.toString();
    }

    public static void main(String[] args) {
        // Example usage
        String originalString = "Hello, world!";
        char charToRemove = 'l';

        // Call the popChar function
        String modifiedString = popChar(originalString, charToRemove);

        // Display the results
        System.out.println("Original String: " + originalString);
        System.out.println("Character to remove: " + charToRemove);
        System.out.println("Modified String: " + modifiedString);
    }
}
