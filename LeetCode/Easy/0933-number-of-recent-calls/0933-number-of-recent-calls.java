import java.util.*;

class RecentCounter {
    private final Queue<Integer> counter;

    public RecentCounter() {
        this.counter = new LinkedList<>();
    }

    public int ping(int t) {
        while (!counter.isEmpty() && (counter.peek() < t - 3000 || counter.peek() > t)) {
            counter.remove();
        }

        counter.add(t);

        return counter.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */