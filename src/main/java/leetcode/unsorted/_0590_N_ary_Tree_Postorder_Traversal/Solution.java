package leetcode.unsorted._0590_N_ary_Tree_Postorder_Traversal;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> postorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> outputArr = new LinkedList<>();

        if (root == null) {
            return outputArr;
        }
        stack.add(root);

        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            outputArr.addFirst(node.val);
            stack.addAll(node.children);
        }
        return outputArr;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}