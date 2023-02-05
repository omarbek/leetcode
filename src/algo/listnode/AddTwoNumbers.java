package algo.listnode;


public class AddTwoNumbers {
    public static void main(String[] args) {
//        ListNode llist = new ListNode(2);
//        llist.next = new ListNode(4);
//        llist.next.next = new ListNode(3);
//        ListNode llist2 = new ListNode(5);
//        llist2.next = new ListNode(6);
//        llist2.next.next = new ListNode(4);
//        ListNode head = new AddTwoNumbers().addTwoNumbers(llist, llist2);
//        System.out.println(head.val);
//        System.out.println(head.next.val);
//        System.out.println(head.next.next.val);

//        ListNode llist = new ListNode(0);
//        ListNode llist2 = new ListNode(0);
//        ListNode head = new AddTwoNumbers().addTwoNumbers(llist, llist2);
//        System.out.println(head.val);

        ListNode llist = new ListNode(9);
        llist.next = new ListNode(9);
        llist.next.next = new ListNode(9);
        llist.next.next.next = new ListNode(9);
        llist.next.next.next.next = new ListNode(9);
        llist.next.next.next.next.next = new ListNode(9);
        llist.next.next.next.next.next.next = new ListNode(9);
        ListNode llist2 = new ListNode(9);
        llist2.next = new ListNode(9);
        llist2.next.next = new ListNode(9);
        llist2.next.next.next = new ListNode(9);
        ListNode head = new AddTwoNumbers().addTwoNumbers(llist, llist2);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {//10-task
//        if (l1 == null && l2 == null) {
//            return null;
//        }
//        if (l1 == null) {
//            return l2;
//        }
//        if (l2 == null) {
//            return l1;
//        }
//        Stack stack = new Stack();
//        while (l1 != null) {
//            stack.push(l1.val);
//            l1 = l1.next;
//        }
//        String count1 = "";
//        while (!stack.empty()) {
//            Integer pop = (Integer) stack.pop();
//            count1 += pop;
//        }
//        stack = new Stack();
//        while (l2 != null) {
//            stack.push(l2.val);
//            l2 = l2.next;
//        }
//        String count2 = "";
//        while (!stack.empty()) {
//            Integer pop = (Integer) stack.pop();
//            count2 += pop;
//        }
//        BigInteger sum = new BigInteger(count1).add(new BigInteger(count2));
//        String var = sum.toString();
//        ListNode head = new ListNode(Integer.parseInt(var.charAt(var.length() - 1) + ""));
//        ListNode temp = head;
//        for (int i = var.length() - 2; i >= 0; i--) {
//            String ch = var.charAt(i) + "";
//            head.next = new ListNode(Integer.parseInt(ch));
//            head = head.next;
//        }
//        return temp;
//    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {//10-task
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return dummyHead.next;
    }
}
