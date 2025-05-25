import java.util.*;

class Solution {
    public String reverseWords(String s) {
        String[] parts = s.trim().split("\\s+");
        List<String> words = new ArrayList<>(Arrays.asList(parts));
        Collections.reverse(words);

        return String.join(" ", words);
    }
}