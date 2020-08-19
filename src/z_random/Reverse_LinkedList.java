package z_random;
import java.util.Stack;

/*
Reverse Linked List
 */
public class Reverse_LinkedList {

// Reverse Linked List






























    private static class LinkedList{
        Node head;
        private static class Node {
            int data;
            Node next;

            Node(int x) {
                data = x;
            }

        }
    }

    private static LinkedList.Node reverseLinkedList(LinkedList.Node node) {
        Stack<LinkedList.Node> stack = new Stack<>();
        while (node != null){
            stack.push(node);
            node = node.next;
        }

        LinkedList.Node dummyNode = new LinkedList.Node(-1);
        node = dummyNode;
        while (!stack.isEmpty()){
            LinkedList.Node currentNode = stack.pop();
            node.next = new LinkedList.Node(currentNode.data);
            node = node.next;
        }
        return dummyNode;
    }
}
