package algo.listnode;

import algo.listnode.SinglyLinkedListNode;

public class FindMergeNode {

    public static void main(String[] args) {
        SinglyLinkedListNode llist = new SinglyLinkedListNode(1);
        llist.next = new SinglyLinkedListNode(2);
        llist.next.next = new SinglyLinkedListNode(3);
        llist.next.next.next = new SinglyLinkedListNode(7);
        llist.next.next.next.next = new SinglyLinkedListNode(8);
        SinglyLinkedListNode llist2 = new SinglyLinkedListNode(4);
        llist2.next = new SinglyLinkedListNode(5);
        llist2.next.next = new SinglyLinkedListNode(6);
        llist2.next.next.next = new SinglyLinkedListNode(7);
        llist2.next.next.next.next = new SinglyLinkedListNode(8);

//        SinglyLinkedListNode llist = new SinglyLinkedListNode(1);
//        llist.next = new SinglyLinkedListNode(2);
//        llist.next.next = new SinglyLinkedListNode(3);
//        SinglyLinkedListNode llist2 = new SinglyLinkedListNode(1);
//        llist2.next = new SinglyLinkedListNode(3);
//        System.out.println(findMergeNode(llist, llist2));

//        SinglyLinkedListNode llist = new SinglyLinkedListNode(1);
//        llist.next = new SinglyLinkedListNode(2);
//        llist.next.next = new SinglyLinkedListNode(3);
//        SinglyLinkedListNode llist2 = new SinglyLinkedListNode(1);
//        llist2.next = new SinglyLinkedListNode(2);
//        llist2.next.next = new SinglyLinkedListNode(3);

        System.out.println(findMergeNode(llist, llist2));
    }

    static int findMergeNode(SinglyLinkedListNode headA, SinglyLinkedListNode headB) {//6-task
        SinglyLinkedListNode currentA = headA;
        SinglyLinkedListNode currentB = headB;

        while(currentA != currentB){
            if(currentA.next == null){
                currentA = headB;
            }else{
                currentA = currentA.next;
            }

            if(currentB.next == null){
                currentB = headA;
            }else{
                currentB = currentB.next;
            }
        }
        return currentB.data;
    }
}
