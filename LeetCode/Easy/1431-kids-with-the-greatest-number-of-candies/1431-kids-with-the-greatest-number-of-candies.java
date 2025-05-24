import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = Arrays.stream(candies).max().getAsInt();
        List<Boolean> result = new ArrayList<>();
        for(int i = 0; i < candies.length; i++) {
            result.add((candies[i] + extraCandies) >= maxCandies);
        }
        return result;
    }
}