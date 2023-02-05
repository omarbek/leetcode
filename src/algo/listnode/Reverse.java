package algo.listnode;

public class Reverse {
    public static void main(String[] args) {
        SinglyLinkedListNode llist = new SinglyLinkedListNode(1);
        llist.next = new SinglyLinkedListNode(2);
        llist.next.next = new SinglyLinkedListNode(3);
        llist.next.next.next = new SinglyLinkedListNode(4);
        llist.next.next.next.next = new SinglyLinkedListNode(5);

        SinglyLinkedListNode head = reverseList(llist);

        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);
        System.out.println(head.next.next.next.next.data);
    }

//    static SinglyLinkedListNode ret;
//    static SinglyLinkedListNode temp;
//
//    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
//        if (llist == null) {
//            return null;
//        }
//        setData(llist);
//        return temp;
//    }
//
//    private static void setData(SinglyLinkedListNode llist) {
//        if (llist.next == null) {
//            ret = llist;
//            temp = ret;
//        } else {
//            setData(llist.next);
//            llist.next = null;
//            ret.next = llist;
//            ret = ret.next;
//        }
//    }

    public static SinglyLinkedListNode reverseList(SinglyLinkedListNode head) {//1-task
        SinglyLinkedListNode newHead = null;
        while (head != null) {
            SinglyLinkedListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}
