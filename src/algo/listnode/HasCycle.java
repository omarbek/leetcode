package algo.listnode;

public class HasCycle {
    public static void main(String[] args) {
        SinglyLinkedListNode llist = new SinglyLinkedListNode(1);
        llist.next = new SinglyLinkedListNode(2);
        llist.next.next = new SinglyLinkedListNode(3);
        llist.next.next.next = new SinglyLinkedListNode(2);

        System.out.println(hasCycle(llist));
    }

    static boolean hasCycle(SinglyLinkedListNode head) {//9-task
        if (head == null) {
            return false;
        }
        SinglyLinkedListNode slow = head;
        SinglyLinkedListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
