package leetcode._0002_Add_Two_Numbers;

/*
1. set two pointers, one for each input list. Create head of new list
2. add value that our pointers are at
3. check if there is carry, add 1
 */
class BetterSolution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode dummy = l3;
        int carry = 0;
        int currentSum;
        while (l1.next != null && l2.next != null) {
             currentSum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
             l3.val = currentSum;
             carry = currentSum >= 10 ? 1 : 0;
             if (l1 != null) l1 = l1.next;
             if (l2 != null) l2 = l2.next;
             l3.next = new ListNode();
             l3 = l3.next;
        }
        return dummy;
    }

}
