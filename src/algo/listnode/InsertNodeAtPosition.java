package algo.listnode;

public class InsertNodeAtPosition {
    public static void main(String[] args) {
        SinglyLinkedListNode head = null;
        head = insertNodeAtPosition(head, 16, 0);
        head = insertNodeAtPosition(head, 13, 1);
        head = insertNodeAtPosition(head, 7, 2);
        head = insertNodeAtPosition(head, 1, 2);

        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);
    }

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        if (llist == null) {
            return new SinglyLinkedListNode(data);
        }
        SinglyLinkedListNode temp = llist;
        int count = position - 1;
        while (count != 0) {
            temp = temp.next;
            count--;
        }
        if (temp.next == null) {
            temp.next = new SinglyLinkedListNode(data);
        } else {
            SinglyLinkedListNode val = temp.next;
            temp.next = new SinglyLinkedListNode(data);
            temp.next.next = val;
        }
        return llist;
    }
}
