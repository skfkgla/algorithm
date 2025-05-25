import java.util.*;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max = 0;
        for(int i = 0; i < k; i++) {
            max += nums[i];
        }
        int currentValue = max;
        for (int i = k; i < nums.length; i++) {
            currentValue += nums[i] - nums[i - k];
            max = Math.max(max, currentValue);
        }
        return (double) max / k;
    }
}