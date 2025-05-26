import java.util.*;

class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int startPoint = 0;
        int endPoint = height.length - 1;
        
        while(startPoint != endPoint) {
            int smallerLine = Math.min(height[startPoint], height[endPoint]);
            int currentArea = smallerLine * (endPoint - startPoint);
            maxArea = Math.max(currentArea, maxArea);
            if (smallerLine == height[startPoint]) {
                startPoint++;
            } else {
                endPoint--;
            }
        }
        return maxArea;
    }
}