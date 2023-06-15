package leetcode.unsorted._0146_LRU_Cache;

public class Runner4 {
    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(2,1);
        lRUCache.put(1,1);
        lRUCache.put(2,3);
        lRUCache.put(4,1);
        lRUCache.get(1);
        lRUCache.get(2);
        System.out.println(lRUCache);
    }
}
