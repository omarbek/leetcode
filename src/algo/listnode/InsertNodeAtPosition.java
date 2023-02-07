package algo.listnode;

public class InsertNodeAtPosition {
    public static void main(String[] args) {
        SinglyLinkedListNode llist = new SinglyLinkedListNode(16);
        llist.next = new SinglyLinkedListNode(13);
        llist.next.next = new SinglyLinkedListNode(7);
        SinglyLinkedListNode head = insertNodeAtPosition(llist, 1, 2);

        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);
    }

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {//14-task
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if (position == 0) {
            node.next = llist;
            return node;
        }
        SinglyLinkedListNode head = llist;
        while ((position - 1) != 0) {
            llist = llist.next;
            position--;
        }
        SinglyLinkedListNode next = llist.next;
        llist.next = node;
        node.next = next;
        return head;
    }
}
