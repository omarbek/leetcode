package algo.date_20220424;

public class Reverse {
    public static void main(String[] args) {
        SinglyLinkedListNode llist = new SinglyLinkedListNode(1);
        llist.next = new SinglyLinkedListNode(2);
        llist.next.next = new SinglyLinkedListNode(3);
        llist.next.next.next = new SinglyLinkedListNode(4);
        llist.next.next.next.next = new SinglyLinkedListNode(5);

        SinglyLinkedListNode head = reverse(llist);

        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);
        System.out.println(head.next.next.next.next.data);
    }

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        if (llist == null) {
            return null;
        }
        SinglyLinkedListNode temp = null;
        while (llist != null) {
            SinglyLinkedListNode next = llist.next;
            llist.next = temp;
            temp = llist;
            llist = next;
        }
        return temp;
    }
}
