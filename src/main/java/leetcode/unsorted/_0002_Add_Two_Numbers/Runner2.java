package leetcode.unsorted._0002_Add_Two_Numbers;

public class Runner2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1_7 = new ListNode(9);
        ListNode l1_6 = new ListNode(9, l1_7);
        ListNode l1_5 = new ListNode(9, l1_6);
        ListNode l1_4 = new ListNode(9, l1_5);
        ListNode l1_3 = new ListNode(9, l1_4);
        ListNode l1_2 = new ListNode(9, l1_3);
        ListNode l1 = new ListNode(9, l1_2);

        ListNode l2_4 = new ListNode(9);
        ListNode l2_3 = new ListNode(9, l2_4);
        ListNode l2_2 = new ListNode(9, l2_3);
        ListNode l2 = new ListNode(9 , l2_2);

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
