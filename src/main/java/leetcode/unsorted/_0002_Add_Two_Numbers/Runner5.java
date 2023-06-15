package leetcode.unsorted._0002_Add_Two_Numbers;

public class Runner5 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(9);

        ListNode l2_10 = new ListNode(9);
        ListNode l2_9 = new ListNode(9, l2_10);
        ListNode l2_8 = new ListNode(9, l2_9);
        ListNode l2_7 = new ListNode(9, l2_8);
        ListNode l2_6 = new ListNode(9, l2_7);
        ListNode l2_5 = new ListNode(9, l2_6);
        ListNode l2_4 = new ListNode(9, l2_5);
        ListNode l2_3 = new ListNode(9, l2_4);
        ListNode l2_2 = new ListNode(9, l2_3);
        ListNode l2 = new ListNode(1, l2_2);

        ListNode result = solution.addTwoNumbers(l1, l2);

        printLinkedListNodes(result);
    }

    public static void printLinkedListNodes(ListNode firstNode) {
        ListNode currentNode = firstNode;
        System.out.println(currentNode.val);
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            System.out.println(currentNode.val);
        }
    }
}
