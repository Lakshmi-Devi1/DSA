public class PalindromeChecker {

    // Function to check if a string is a palindrome using two pointers
    public static boolean isPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Initialize two pointers
        int left = 0;
        int right = cleanedStr.length() - 1;

        // Check characters from both ends of the string
        while (left < right) {
            // Compare characters at the left and right pointers
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false; // Not a palindrome
            }
            // Move the pointers towards the center
            left++;
            right--;
        }

        return true; // The string is a palindrome
    }

    public static void main(String[] args) {
        // Test cases
        String[] testStrings = {
            "A man, a plan, a canal, Panama",
            "racecar",
            "hello",
            "Was it a car or a cat I saw?"
        };

        // Check each string and print the result
        for (String str : testStrings) {
            System.out.println("\"" + str + "\" is a palindrome: " + isPalindrome(str));
        }
    }
}
