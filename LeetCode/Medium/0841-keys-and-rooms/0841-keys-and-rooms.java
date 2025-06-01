import java.util.*;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> s = new Stack<>();
        s.push(0);
        visited.add(0);

        while (!s.isEmpty()) {
            int key = s.pop();
            List<Integer> newKeys = rooms.get(key);
            for (Integer newKey : newKeys) {
                if (!visited.contains(newKey)) {
                    visited.add(newKey);
                    s.push(newKey);
                }
            }
        }

        return rooms.size() == visited.size();
    }
}