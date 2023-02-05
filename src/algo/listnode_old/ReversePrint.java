package algo.listnode_old;


public class ReversePrint {
    public static void main(String[] args) {
        SinglyLinkedListNode llist = new SinglyLinkedListNode(1);
        llist.next = new SinglyLinkedListNode(2);
        llist.next.next = new SinglyLinkedListNode(3);
        llist.next.next.next = new SinglyLinkedListNode(4);
        llist.next.next.next.next = new SinglyLinkedListNode(5);
        reversePrint(llist);
    }

    public static void reversePrint(SinglyLinkedListNode llist) {
        if (llist != null) {
            reversePrint(llist.next);
            System.out.println(llist.data);
        }
    }
}
