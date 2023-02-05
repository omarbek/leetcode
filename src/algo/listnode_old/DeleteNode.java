package algo.listnode_old;


public class DeleteNode {
    public static void main(String[] args) {
        SinglyLinkedListNode i = new SinglyLinkedListNode(20);
        i.next = new SinglyLinkedListNode(6);
        i.next.next = new SinglyLinkedListNode(2);
        i.next.next.next = new SinglyLinkedListNode(19);
        i.next.next.next.next = new SinglyLinkedListNode(7);
        i.next.next.next.next.next = new SinglyLinkedListNode(4);
        i.next.next.next.next.next.next = new SinglyLinkedListNode(15);
        i.next.next.next.next.next.next.next = new SinglyLinkedListNode(9);
        SinglyLinkedListNode head = deleteNode(i, 3);

        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);
        System.out.println(head.next.next.next.next.data);
        System.out.println(head.next.next.next.next.next.data);
        System.out.println(head.next.next.next.next.next.next.data);
    }

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        if (llist == null) {
            return null;
        }
        if (position == 0) {
            return llist.next;
        }
        SinglyLinkedListNode temp = llist;
        while ((position - 1) != 0) {
            temp = temp.next;
            position--;
        }
        temp.next = temp.next.next;
        return llist;
    }
}
