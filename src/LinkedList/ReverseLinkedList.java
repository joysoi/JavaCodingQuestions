package LinkedList;

import java.util.Stack;

/*
Reverse Linked List
 */
public class ReverseLinkedList {
    public static class LinkedListNode {
        int val;
        LinkedListNode next;

        LinkedListNode(int x) {
            val = x;
        }
    }
































    private static LinkedListNode reverseLinkedList(LinkedListNode head) {
        Stack<LinkedListNode> stack = new Stack<>();
        //add nodes to stack
        while (head != null) {
            stack.push(head);
            head = head.next;
        }

        // pointer node if the new LinkedList that has yet to be reversed
        LinkedListNode dummy = new LinkedListNode(-1);
        head = dummy;
        while (!stack.isEmpty()) {
            LinkedListNode currentNode = stack.pop();
            // link the nodes to the new values:
            head.next = new LinkedListNode(currentNode.val);
            // have to keep looping to the next node
            head = head.next;
        }
        return dummy;
    }
}
