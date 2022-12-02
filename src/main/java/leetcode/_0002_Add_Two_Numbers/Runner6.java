package leetcode._0002_Add_Two_Numbers;

public class Runner6 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1_31 = new ListNode(1);
        ListNode l1_30 = new ListNode(0, l1_31);
        ListNode l1_29 = new ListNode(0, l1_30);
        ListNode l1_28 = new ListNode(0, l1_29);
        ListNode l1_27 = new ListNode(0, l1_28);
        ListNode l1_26 = new ListNode(0, l1_27);
        ListNode l1_25 = new ListNode(0, l1_26);
        ListNode l1_24 = new ListNode(0, l1_25);
        ListNode l1_23 = new ListNode(0, l1_24);
        ListNode l1_22 = new ListNode(0, l1_23);
        ListNode l1_21 = new ListNode(0, l1_22);
        ListNode l1_20 = new ListNode(0, l1_21);
        ListNode l1_19 = new ListNode(0, l1_20);
        ListNode l1_18 = new ListNode(0, l1_19);
        ListNode l1_17 = new ListNode(0, l1_18);
        ListNode l1_16 = new ListNode(0, l1_17);
        ListNode l1_15 = new ListNode(0, l1_16);
        ListNode l1_14 = new ListNode(0, l1_15);
        ListNode l1_13 = new ListNode(0, l1_14);
        ListNode l1_12 = new ListNode(0, l1_13);
        ListNode l1_11 = new ListNode(0, l1_12);
        ListNode l1_10 = new ListNode(0, l1_11);
        ListNode l1_9 = new ListNode(0, l1_10);
        ListNode l1_8 = new ListNode(0, l1_9);
        ListNode l1_7 = new ListNode(0, l1_8);
        ListNode l1_6 = new ListNode(0, l1_7);
        ListNode l1_5 = new ListNode(0, l1_6);
        ListNode l1_4 = new ListNode(0, l1_5);
        ListNode l1_3 = new ListNode(0, l1_4);
        ListNode l1_2 = new ListNode(0, l1_3);
        ListNode l1 = new ListNode(1, l1_2);


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
