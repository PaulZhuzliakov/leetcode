package leetcode._0146_LRU_Cache;

public class Runner2 {
    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(2);
        System.out.println("null");
        lRUCache.put(1,1);
        lRUCache.put(2,2);
        lRUCache.get(1);
        lRUCache.put(3,3);
        lRUCache.get(2);
        lRUCache.put(4,4);
        lRUCache.get(1);
        lRUCache.get(3);
        lRUCache.get(4);
        System.out.println(lRUCache);
    }
}
