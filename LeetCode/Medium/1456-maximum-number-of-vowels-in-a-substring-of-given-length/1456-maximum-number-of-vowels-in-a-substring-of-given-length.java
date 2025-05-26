import java.util.*;

class Solution {
    public int maxVowels(String s, int k) {
        int maxVowels = 0;
        int currentCount = 0;
        String vowels = "aeiou";
        for (int i = 0; i < k; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                currentCount++;
            }
        }
        maxVowel = currentCount;
        for (int i = k; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                currentCount++;
            }
            if (vowels.indexOf(s.charAt(i - k)) != -1) {
                currentCount--;
            }
            maxVowels = Math.max(currentCount, maxVowels);
        }

        return maxVowels;
    }
}