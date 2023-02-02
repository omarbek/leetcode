package algo.listnode;

public class RemoveDuplicates {

    public static void main(String[] args) {
        SinglyLinkedListNode llist = new SinglyLinkedListNode(1);
        llist.next = new SinglyLinkedListNode(2);
        llist.next.next = new SinglyLinkedListNode(2);
        llist.next.next.next = new SinglyLinkedListNode(4);
        llist.next.next.next.next = new SinglyLinkedListNode(4);

        SinglyLinkedListNode head = removeDuplicates(llist);

        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
    }

    public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
        if (llist == null) {
            return null;
        }
        SinglyLinkedListNode next = llist.next;
        while (next != null && llist.data == next.data) {
            next = next.next;
        }
        llist.next = removeDuplicates(next);
        return llist;
    }
}
