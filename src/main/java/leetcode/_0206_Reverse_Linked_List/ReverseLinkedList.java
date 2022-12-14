package leetcode._0206_Reverse_Linked_List;

import leetcode._0206_Reverse_Linked_List.Node;

public class ReverseLinkedList {
    public Node reverseList(Node head) {
        Node prev = null;

        while (head != null) {
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }


}


//  Definition for singly-linked list.
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
 