package algo.listnode;

import algo.listnode.SinglyLinkedListNode;

public class GetNode {

    public static void main(String[] args) {
        SinglyLinkedListNode llist = new SinglyLinkedListNode(1);
        llist.next = new SinglyLinkedListNode(2);
        llist.next.next = new SinglyLinkedListNode(3);
        llist.next.next.next = new SinglyLinkedListNode(4);
        llist.next.next.next.next = new SinglyLinkedListNode(5);

        System.out.println(getNode(llist, 2));
    }


    public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {//4-task
        SinglyLinkedListNode runner = llist;
        SinglyLinkedListNode curr = llist;

        for (int i = 0; i < positionFromTail; i++) {
            runner = runner.next;
        }
        while (runner.next != null) {
            runner = runner.next;
            curr = curr.next;
        }
        return curr.data;
    }
}
