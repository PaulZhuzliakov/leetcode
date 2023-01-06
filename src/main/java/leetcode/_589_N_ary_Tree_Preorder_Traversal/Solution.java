package leetcode._589_N_ary_Tree_Preorder_Traversal;

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<Integer> result = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        recursive(root);
        return result;
    }

    void recursive(Node node) {
        if (node != null) {
            result.add(node.val);
            if (node.children != null) {
                for (Node childNode: node.children) {
                    recursive(childNode);
                }
            }
        }
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