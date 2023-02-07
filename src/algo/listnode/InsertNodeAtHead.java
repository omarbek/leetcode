package algo.listnode;


public class InsertNodeAtHead {
    public static void main(String[] args) {
        SinglyLinkedListNode head = null;
        head = insertNodeAtHead(head, 383);
        head = insertNodeAtHead(head, 484);
        head = insertNodeAtHead(head, 392);
        head = insertNodeAtHead(head, 975);
        head = insertNodeAtHead(head, 321);

        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);
        System.out.println(head.next.next.next.next.data);
    }

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {//13-task
        SinglyLinkedListNode ret = new SinglyLinkedListNode(data);
        if (llist == null) {
            return ret;
        }
        ret.next = llist;
        return ret;
    }
}
