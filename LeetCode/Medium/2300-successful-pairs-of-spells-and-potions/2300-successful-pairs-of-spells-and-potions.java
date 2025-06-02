import java.util.*;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] result = new int[spells.length];
        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            result[i] = successfulPairs(spells[i], potions, success);
        }
        return result;
    }

    public int successfulPairs(int spell, int[] potions, long success) {
        int start = 0;
        int end = potions.length - 1;
        int pivot = potions.length;

        while (start <= end) {
            int currentPivot = (start + end) / 2;
            if ((long)spell * potions[currentPivot] >= success) {
                pivot = currentPivot;
                end = currentPivot - 1;
            }
            else {
                start = currentPivot + 1;
            }
        }
        return potions.length - pivot;
    }
}