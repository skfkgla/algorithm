class Solution {
    public boolean isSubsequence(String s, String t) {
        int sameCount = 0;
        for (int i = 0; i < t.length(); i++) {
            if (sameCount == s.length()) {
                break;
            }
            if (t.charAt(i) == s.charAt(sameCount)) {
                sameCount++;
            }
        }
        return sameCount == s.length();
    }
}