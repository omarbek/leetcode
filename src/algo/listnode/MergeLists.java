package algo.listnode;

import algo.listnode.SinglyLinkedListNode;

public class MergeLists {

    public static void main(String[] args) {
        SinglyLinkedListNode head1 = new SinglyLinkedListNode(1);
        head1.next = new SinglyLinkedListNode(3);
        head1.next.next = new SinglyLinkedListNode(7);

        SinglyLinkedListNode head2 = new SinglyLinkedListNode(1);
        head2.next = new SinglyLinkedListNode(2);

        SinglyLinkedListNode head = mergeLists(head1, head2);

        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);
        System.out.println(head.next.next.next.next.data);
    }

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {//3-task
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        SinglyLinkedListNode ret = null;
        if (head1.data > head2.data) {
            ret = head2;
            head2 = head2.next;
        } else {
            ret=head1;
            head1 = head1.next;
        }
        SinglyLinkedListNode node = ret;
        while (head1 != null && head2 != null) {
            if (head1.data > head2.data) {
                node.next = head2;
                head2 = head2.next;
            } else {
                node.next = head1;
                head1 = head1.next;
            }
            node = node.next;
        }
        if (head1 == null) {
            node.next = head2;
        } else {
            node.next = head1;
        }
        return ret;
    }
}
