import java.util.*;

class Solution {
    public String reverseWords(String s) {
        String[] parts = s.trim().split("\\s+");

        for (int i = 0, j = parts.length - 1; i < j; i++, j--) {
            String temp = parts[i];
            parts[i] = parts[j];
            parts[j] = temp;
        }
        return String.join(" ", parts);
    }
}