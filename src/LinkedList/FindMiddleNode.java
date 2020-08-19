package LinkedList;

public class FindMiddleNode {

    public static class LinkedList {
        Node head;

        public class Node {
            int val;
            Node next;

            public Node(int x) {
                val = x;
            }
        }
    }

    private static LinkedList.Node findMiddleElement(LinkedList list) {
        LinkedList.Node fastNode = list.head;
        LinkedList.Node slowNode = list.head;
        while (fastNode.next != null && fastNode.next.next != null) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }
        return slowNode;
    }
}



