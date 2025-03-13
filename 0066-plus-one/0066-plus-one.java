import java.util.Arrays;

public class PlusOne {


    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // Increment current digit
                return digits; // Return result if no carry is needed
            }
            digits[i] = 0; // Set current digit to 0 and continue loop (carry over)
        }

        // If all digits were 9, we need an extra digit at the start
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1; // First digit is 1, rest are 0 (e.g., 999 → 1000)
        return newDigits;
    }
}class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // Increment the digit and return
                return digits;
            }
            digits[i] = 0; // If digit is 9, set it to 0 and continue
        }

        // If all digits were 9, we need a new array with an extra digit
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1; // First digit is 1, rest are 0
        return newDigits;
    }
}

