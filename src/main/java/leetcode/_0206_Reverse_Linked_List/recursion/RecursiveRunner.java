package leetcode._0206_Reverse_Linked_List.recursion;

public class RecursiveRunner {
    public static void main(String[] args) {
        Node node5 = new Node(5);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);

        RecursiveSolution solution = new RecursiveSolution();
        Node node = solution.reverseList(node1);
        printListNodes(node);
    }

    public static void printListNodes(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.val);
        while (node.next != null) {
            node = node.next;
            System.out.println(node.val);
        }
    }
}
