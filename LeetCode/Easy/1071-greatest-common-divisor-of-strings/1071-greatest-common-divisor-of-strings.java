import java.util.*;

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int gcd = gcd(str1.length(), str2.length());

        String candidate = str1.substring(0, gcd);
        if (isDivisible(str1, candidate) && isDivisible(str2, candidate)) {
            return candidate;
        }
        return "";
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private boolean isDivisible(String str, String divStr) {
        int cnt = str.length() / divStr.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cnt; i++) {
            sb.append(divStr);
        }
        return sb.toString().equals(str);
    }
}