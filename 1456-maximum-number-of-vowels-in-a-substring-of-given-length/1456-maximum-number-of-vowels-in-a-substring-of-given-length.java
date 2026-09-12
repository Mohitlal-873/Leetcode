class Solution {
    public int maxVowels(String s, int k) {

        int count = 0;
        int max = 0;

        // First window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        max = count;

        // Slide the window
        for (int right = k; right < s.length(); right++) {

            // Add the new character
            if (isVowel(s.charAt(right))) {
                count++;
            }

            // Remove the character that left the window
            if (isVowel(s.charAt(right - k))) {
                count--;
            }

            max = Math.max(max, count);
        }

        return max;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}