package algo.listnode;

import algo.listnode.DoublyLinkedListNode;

public class ReverseDoublyLinkedListNode {
    public static void main(String[] args) {
        DoublyLinkedListNode llist = new DoublyLinkedListNode(1);
        llist.next = new DoublyLinkedListNode(2);
        llist.next.next = new DoublyLinkedListNode(3);
        llist.next.next.next = new DoublyLinkedListNode(4);
        llist.next.next.next.next = new DoublyLinkedListNode(5);
        DoublyLinkedListNode head = reverse(llist);
        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);
        System.out.println(head.next.next.next.next.data);
    }

    public static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {//8-task
        DoublyLinkedListNode newHead = head;
        DoublyLinkedListNode temp = head;
        while (temp != null) {
            DoublyLinkedListNode prev = temp.prev;
            temp.prev = temp.next;
            temp.next = prev;
            newHead = temp;
            temp = temp.prev;
        }
        return newHead;
    }
}
