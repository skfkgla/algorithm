import java.util.*;

class RecentCounter {
    private final Queue<Integer> counter;

    public RecentCounter() {
        this.counter = new LinkedList<>();
    }
    
    public int ping(int t) {
        counter.removeIf(time -> time < t - 3000 || time > t);
        counter.add(t);
        
        return counter.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */