package algo.listnode;

public class SortedInsert {
    public static void main(String[] args) {
        DoublyLinkedListNode llist = new DoublyLinkedListNode(1);
        llist.next = new DoublyLinkedListNode(3);
        llist.next.next = new DoublyLinkedListNode(4);
        llist.next.next.next = new DoublyLinkedListNode(10);
        DoublyLinkedListNode head = sortedInsert(llist, 5);
        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);
        System.out.println(head.next.next.next.next.data);

//        DoublyLinkedListNode llist = new DoublyLinkedListNode(1);
//        llist.next = new DoublyLinkedListNode(2);
//        llist.next.next = new DoublyLinkedListNode(3);
//        DoublyLinkedListNode head = sortedInsert(llist, 4);
//        System.out.println(head.data);
//        System.out.println(head.next.data);
//        System.out.println(head.next.next.data);
//        System.out.println(head.next.next.next.data);

//        DoublyLinkedListNode llist = new DoublyLinkedListNode(2);
//        llist.next = new DoublyLinkedListNode(3);
//        llist.next.next = new DoublyLinkedListNode(4);
//        DoublyLinkedListNode head = sortedInsert(llist, 1);
//        System.out.println(head.data);
//        System.out.println(head.next.data);
//        System.out.println(head.next.next.data);
//        System.out.println(head.next.next.next.data);
    }

//    public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data) {
//        if (llist == null) {
//            return null;
//        }
//        DoublyLinkedListNode head;
//        if (data > llist.data) {
//            head = llist;
//        } else {
//            head = new DoublyLinkedListNode(data);
//            head.next = llist;
//            return head;
//        }
//        while (llist.next != null) {
//            if (data < llist.next.data) {
//                DoublyLinkedListNode temp = llist.next;
//                DoublyLinkedListNode next = new DoublyLinkedListNode(data);
//                llist.next = next;
//                next.next = temp;
//                return head;
//            } else {
//                llist = llist.next;
//            }
//        }
//        llist.next = new DoublyLinkedListNode(data);
//        return head;
//    }

    public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode node=new DoublyLinkedListNode(data);
        if(head==null){
            return node;
        }
        if(data<= head.data){
            node.next=head;
            head.prev=node;
            return node;
        }
        DoublyLinkedListNode rest = sortedInsert(head.next, data);
        head.next=rest;
        rest.prev=head;
        return head;
    }
}
