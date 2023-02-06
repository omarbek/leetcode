package algo.listnode;


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

//        SinglyLinkedListNode i = new SinglyLinkedListNode(11);
//        i.next = new SinglyLinkedListNode(12);
//        i.next.next = new SinglyLinkedListNode(8);
//        i.next.next.next = new SinglyLinkedListNode(18);
//        i.next.next.next.next = new SinglyLinkedListNode(16);
//        i.next.next.next.next.next = new SinglyLinkedListNode(5);
//        i.next.next.next.next.next.next = new SinglyLinkedListNode(18);
//        SinglyLinkedListNode head = deleteNode(i, 0);

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {//11-task
        if (llist == null) {
            return null;
        }
        if (position == 0) {
            return llist.next;
        }
        SinglyLinkedListNode head = llist;
        while ((position - 1) != 0) {
            llist = llist.next;
            position--;
        }
        llist.next = llist.next.next;
        return head;
    }
}
