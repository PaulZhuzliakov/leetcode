package leetcode._0002_Add_Two_Numbers;

public class Runner {
    public static void main(String[] args) {

        Solution solution = new Solution();
        ListNode l1_3 = new ListNode(1);        //2 -> 4 -> 3
        ListNode l1_2 = new ListNode(0, l1_3);
        ListNode l1 = new ListNode(2, l1_2);

        ListNode l2_3 = new ListNode(4);        //5 -> 6 -> 4
        ListNode l2_2 = new ListNode(6, l2_3);
        ListNode l2 = new ListNode(5, l2_2);

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
