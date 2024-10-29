package leetcode._0590_N_ary_Tree_Postorder_Traversal;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Node root = new Node(1);

        Node lvl1_n1 = new Node(3);
        Node lvl1_n2 = new Node(2);
        Node lvl1_n3 = new Node(4);
        root.children = List.of(lvl1_n1, lvl1_n2, lvl1_n3);

        Node lvl2_n1 = new Node(5);
        Node lvl2_n2 = new Node(6);
        lvl1_n1.children = List.of(lvl2_n1, lvl2_n2);

        List<Integer> postordered = new Solution().postorder(root);
        System.out.println(postordered);
    }
}


class Node {
    public int val;
    public List<Node> children;

    public Node(int _val) {
        val = _val;
    }
}


class Solution {
    public List<Integer> postorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            result.addFirst(node.val);
            if (node.children != null) {
                for (Node child : node.children) {
                    stack.add(child);
                }
            }
        }
        return result;
    }
}