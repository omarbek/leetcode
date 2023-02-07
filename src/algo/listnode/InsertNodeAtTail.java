package algo.listnode;

public class InsertNodeAtTail {

    public static void main(String[] args) {
        SinglyLinkedListNode head = null;
        head = insertNodeAtTail(head, 141);
        head = insertNodeAtTail(head, 302);
        head = insertNodeAtTail(head, 164);
        head = insertNodeAtTail(head, 530);
        head = insertNodeAtTail(head, 474);

        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);
        System.out.println(head.next.next.next.next.data);
    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {//15-task
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if (head == null) {
            return node;
        }
        head.next = insertNodeAtTail(head.next, data);
        return head;
    }
}
