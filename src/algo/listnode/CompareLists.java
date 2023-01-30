package algo.listnode;

public class CompareLists {

    public static void main(String[] args) {
        SinglyLinkedListNode head1 = new SinglyLinkedListNode(1);
        head1.next = new SinglyLinkedListNode(2);
        head1.next.next = new SinglyLinkedListNode(3);

        SinglyLinkedListNode head2 = new SinglyLinkedListNode(1);
        head2.next = new SinglyLinkedListNode(2);
        head2.next.next = new SinglyLinkedListNode(3);
        head2.next.next.next = new SinglyLinkedListNode(4);

        System.out.println(compareLists(head1, head2));
    }

//    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {//2
//        while (head1 != null && head2 != null && head1.data == head2.data) {
//            head1 = head1.next;
//            head2 = head2.next;
//        }
//        return head1 == head2;
//    }

    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {//recursive
        if (head1 == null && head2 == null) {
            return true;
        }
        if (head1 != null && head2 != null && head1.data == head2.data) {
            return compareLists(head1.next, head2.next);
        }
        return false;
    }
}
