package LinkedList;

public class SinglyLinkedList {
    private ListNode head;


    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display(ListNode listNode) {
        if (listNode != null) {
            while (listNode != null) {
                System.out.print(listNode.data + "--> ");
                listNode = listNode.next;
            }
            System.out.print("null");
        } else {
            ListNode current = head;
            while (current != null) {
                System.out.print(current.data + "--> ");
                current = current.next;
            }
            System.out.print("null");
        }
    }

    public int length() {
        int count = 0;
        if (head == null) {
            return 0;
        }
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertNodeAtGivenPosition(int data, int position) {
        ListNode node = new ListNode(data);
        if (position == 1) {
            node.next = head;
            head = node;
        } else {
            ListNode previous = head;
            int counter = 1;
            while (counter < position - 1) {
                previous = previous.next;
                counter++;
            }
            ListNode current = previous.next;
            node.next = current;
            previous.next = node;
        }
    }

    public void insertNodeAtEnd(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next) {
            current = current.next;
        }
        current.next = newNode;

    }

    public static void main(String[] args) throws Exception {
        SinglyLinkedList ssl = new SinglyLinkedList();
//        ssl.head = null;
//        ssl.head = new ListNode(10);
//        ListNode first = new ListNode(20);
//        ListNode second = new ListNode(5);
//        ListNode third = new ListNode(13);

        //connecting node with each other

//        ssl.head.next = first; //10-->20
//        first.next = second;//10-->20 --> 5
//        second.next = third;//10-->20 --> 5 --> 13
//        ssl.display();
//        System.out.println();
//        System.out.println("Lenght of linkedlist is -: " + ssl.length());
//        System.out.println("Insert data in linked list at given position");
//        ssl.insertNodeAtGivenPosition(19, 5);
//        ssl.display();
        ssl.insertNodeAtEnd(3);
        ssl.insertNodeAtEnd(13);
        ssl.insertNodeAtEnd(23);
        ssl.insertNodeAtEnd(33);
        ssl.insertNodeAtEnd(43);
        ssl.insertNodeAtEnd(63);
//        System.out.println("\nInsert at end");
//        ssl.display();
//        System.out.println("\n Insert at begging");
//        ssl.insertNodeAtBeg(11);
//        ssl.display();
//        System.out.println("\n Delete node from begging");
//        ssl.deleteNodeFromBeg();
//        ssl.display();
//        System.out.println("\n Delete node from End");
//        ssl.deleteNodeFromEnd();
//        ssl.display();
//        System.out.println("\n Delete from given position");
//        ssl.display();
//        System.out.println("\nAfter deleting from position 2");
//        ssl.deleteNodeFromPosition(2);
//        ssl.display();
//        System.out.println("\n delete a desired key 33");
//        ssl.deleteKey(43);
//        ssl.display();
//        System.out.println("\n Remove duplicate from sorted Linked List");
//        ssl.removeDuplicatedFromSortedLL();
//        ssl.display();
        System.out.println("\n reverse a linked list");
//        ssl.display();
        ListNode listNode = ssl.reversLinkedList();
        ssl.display(listNode);

    }

    private ListNode reversLinkedList() {
        ListNode C = head;
        ListNode N = null;
        ListNode P = null;
        while (C != null) {
            N = C.next;
            C.next = P;
            P = C;
            C = N;
        }
        return P;
    }

    private void removeDuplicatedFromSortedLL() {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else
                current = current.next;
        }

    }

    public void deleteKey(int key) {
        if (head.equals(key)) {
            head = head.next;
        } else {
            ListNode current = head;
            ListNode temp = null;
            while (current != null && current.data != key) {
                temp = current;
                current = current.next;
            }
            if (current == null) return;
            temp.next = current.next;
        }
    }

    private void deleteNodeFromEnd() throws Exception {
        if (head == null) {
            throw new Exception("Node is null");
        }
        ListNode current = head;
        ListNode prev = null;
        if (current.next == null) {
            head = null;
        } else {
            while (current.next != null) {
                prev = current;
                current = current.next;
            }
            prev.next = null;
        }
    }

    public void deleteNodeFromPosition(int position) {
        if (position == 1) {
            head = head.next;
        } else {
            ListNode prev = head;
            int count = 1;
            while (count < position - 1) {
                prev = prev.next;
                count++;
            }
            ListNode current = prev.next;
            prev.next = current.next;
        }
    }

    private void deleteNodeFromBeg() throws Exception {
        if (head == null) {
            throw new Exception("Node is null");
        }
        ListNode current = head;
        if (current.next == null) {
            head = null;
        } else {
            current = current.next;
            head = current;
        }
    }

    private void insertNodeAtBeg(int data) {
        ListNode listNode = new ListNode(data);
        if (head == null) {
            head = listNode;
            return;
        }
        ListNode current = head;
        listNode.next = current;
        head = listNode;
    }


}
