package LinkedList;

public class AddNodeToLinkedList {
    public void main(String[] args) {
        int n = 30;
        LinkedList linkedList = new LinkedList();
        addNodeToLinkedList(linkedList, n);
        addNodeToLinkedList(linkedList, 31);
        addNodeToLinkedList(linkedList, 32);
        printLinkedList(linkedList);
    }


































    public static class LinkedList {
        LinkedList.Node head;

        public static class Node {
            int value;
            LinkedList.Node next;

            public Node(int x) {
                value = x;
            }
        }
    }

    private static void addNodeToLinkedList(LinkedList list, int n) {
        LinkedList.Node newNode = new LinkedList.Node(n);
        if (list.head == null) {
            list.head = newNode;
        } else {
            LinkedList.Node traverseNode = list.head;
            while (traverseNode.next != null) {
                traverseNode = traverseNode.next;
            }
            traverseNode.next = newNode;
        }
    }

    private static void printLinkedList(LinkedList list) {
        LinkedList.Node traverseNode = list.head;
        while (traverseNode != null) {
            System.out.println(traverseNode.value + " ");
            traverseNode = traverseNode.next;
        }
    }
}
