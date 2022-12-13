package leetcode._0206_Reverse_Linked_List;

public class Runner {
    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode listNode = reverseLinkedList.reverseList(node1);
        printListNodes(listNode);


    }

    public static void printListNodes(ListNode listNode) {
        if (listNode == null) {
            return;
        }
        System.out.println(listNode.val);
        while (listNode.next != null) {
            listNode = listNode.next;
            System.out.println(listNode.val);
        }
    }
}
