package leetcode.unsorted._0146_LRU_Cache;

import java.util.HashMap;
import java.util.Map;

class LRUCache {
    Map<Integer, Node> cache;
    int cacheCapacity;
    Node dummyHead;
    Node dummyTail;

    public LRUCache(int capacity) {
        cache = new HashMap<>(capacity);
        this.cacheCapacity = capacity;
        dummyHead = new Node();
        dummyTail = new Node();
        dummyHead.next = dummyTail;
        dummyTail.prev = dummyHead;
    }

    public int get(int key) {
        int result;
        Node node = cache.get(key);
        if (node == null) {
            result = -1;
        } else {
            remove(node);
            addToHead(node);
            result = node.value;
        }
        return result;
    }

    public void put(int key, int value) {
        Node dublicateNode = cache.get(key);
        if (cache.size() != cacheCapacity && dublicateNode != null) {
            remove(dublicateNode);
            cache.remove(key);
        }
        if (cache.size() == cacheCapacity) {
            Node toRemoveNode;
            if (dublicateNode == null) {
                toRemoveNode = dummyTail.prev;
                cache.remove(toRemoveNode.key);
                remove(toRemoveNode);
            } else {
                toRemoveNode = cache.get(key);
                cache.remove(key);
                remove(toRemoveNode);
            }
        }

        Node newNode = new Node(key, value);
        cache.put(key, newNode);
        addToHead(newNode);
    }

    void addToHead(Node firstNode) {
        Node headNode = dummyHead.next;
        firstNode.next = headNode;
        headNode.prev = firstNode;
        dummyHead.next = firstNode;
        firstNode.prev = dummyHead;
    }

    void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    @Override
    public String toString() {
        return cache.toString();
    }
}

class Node {
    int key;
    int value;

    Node prev;
    Node next;

    public Node() {
    }

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}