package z_random;

public class RemoveNodeFromLinkedList {
    public void main(String[] args) {
        int n = 30;
        LinkedList linkedList = new LinkedList();
        addNodeToLinkedList(linkedList, n);
        addNodeToLinkedList(linkedList, 31);
        addNodeToLinkedList(linkedList, 32);
        removeNode(linkedList, 1);
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

    private static void removeNode(LinkedList list, int position){
        LinkedList.Node traverseNode = list.head;
        if (position == 0){
            list.head = traverseNode.next;
        }else {
            for (int i = 1; i < position; i++){
                traverseNode = traverseNode.next;
            }
            traverseNode.next = traverseNode.next.next;
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
