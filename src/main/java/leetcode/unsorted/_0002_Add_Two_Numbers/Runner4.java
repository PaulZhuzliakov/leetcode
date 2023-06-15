package leetcode.unsorted._0002_Add_Two_Numbers;

public class Runner4 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(1);

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
