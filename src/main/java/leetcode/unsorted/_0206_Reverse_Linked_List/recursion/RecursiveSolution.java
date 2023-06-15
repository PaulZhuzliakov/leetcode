package leetcode.unsorted._0206_Reverse_Linked_List.recursion;

public class RecursiveSolution {
    public Node reverseList(Node head) {
        return reverse(head, null);
    }

    private Node reverse(Node curr, Node prev) {


        if (curr.next == null) {
            curr.next = prev;
            return curr;
        }
        Node r = reverse(curr.next, curr);
        curr.next = prev;
        return r;
    }
}

class Node {
    int val;
    Node next;

    Node() {
    }

    Node(int val) {
        this.val = val;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}