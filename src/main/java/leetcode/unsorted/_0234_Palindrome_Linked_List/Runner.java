package leetcode.unsorted._0234_Palindrome_Linked_List;

public class Runner {
    public static void main(String[] args) {
        ListNode tail = new ListNode(1);
        ListNode node4 = new ListNode(2, tail);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);

        Solution solution = new Solution();
        boolean palindrome = solution.isPalindrome(head);
        System.out.println(palindrome);
    }
}
