import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return List.of(findDifferenceNums1(nums1, nums2), findDifferenceNums1(nums2, nums1));
    }

    private List<Integer> findDifferenceNums1(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int n : nums2) {
            set2.add(n);
        }

        for (int n : nums1) {
            if (!set2.contains(n)) {
                set1.add(n);
            }
        }
        return new ArrayList<>(set1);
    }
}