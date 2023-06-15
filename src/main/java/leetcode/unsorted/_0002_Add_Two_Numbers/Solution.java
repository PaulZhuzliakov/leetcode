package leetcode.unsorted._0002_Add_Two_Numbers;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedList;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        LinkedList<Integer> list1 = getLinkedList(l1);
        LinkedList<Integer> list2 = getLinkedList(l2);

        BigDecimal sum1 = getSumOfReversedElements(list1);
        BigDecimal sum2 = getSumOfReversedElements(list2);

        LinkedList<Integer> resultList = getListFromInt(sum1, sum2);

        ListNode resultNode = getLinkedResultNode(resultList);

        return resultNode;
    }

    private ListNode getLinkedResultNode(LinkedList<Integer> resultList) {

        Iterator<Integer> iterator = resultList.iterator();
        Integer currentInt = iterator.next();
        ListNode currentNode = new ListNode(currentInt.intValue(), null);
        while (iterator.hasNext()) {
            currentNode = new ListNode(iterator.next().intValue(), currentNode);
        }

        return currentNode;
    }

    private LinkedList<Integer> getListFromInt(BigDecimal sum1, BigDecimal sum2) {
        LinkedList<Integer> resultList = new LinkedList<>();
        char[] chars = String.valueOf(sum1.add(sum2)).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            resultList.add(
                    Integer.valueOf(
                            String.valueOf(
                                    chars[i]
                            )
                    )
            );
        }
        return resultList;
    }

    private BigDecimal getSumOfReversedElements(LinkedList<Integer> list) {
        Iterator<Integer> iterator = list.descendingIterator();
        StringBuilder sb = new StringBuilder();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
        }
        try {
            return new BigDecimal(sb.toString());
        } catch (NumberFormatException e) {
            return new BigDecimal(0);
        }
    }

    private LinkedList<Integer> getLinkedList(ListNode listNode) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ListNode currentNode = listNode;
        if (listNode.next == null) {            //single Node
            linkedList.add(currentNode.val);
            return linkedList;
        }
        while (listNode.next != null && currentNode != null) {
            linkedList.add(currentNode.val);
            currentNode = currentNode.next;
        }

        return linkedList;
    }
}
