package companies.yandex;

import java.util.List;

/**
 * @author omarbekdinasil
 * on 10.02.2022
 * @project leetcode
 */
public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        list1.next = list2;
        list2.next = new ListNode(4);//1 2 4

        ListNode list3 = new ListNode(1);
        ListNode list4 = new ListNode(3);
        list3.next = list4;
        list4.next = new ListNode(4);//1 3 4

        ListNode list = new MergeTwoSortedLists().mergeTwoLists(list1, list3);
        while (true) {
            System.out.println(list.val);
            list = list.next;
            if (list.next == null) {
                System.out.println(list.val);
                break;
            }
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //check for null both listnodes, if null, return null
        if (list1 == null && list2 == null) {
            return null;
        }

        //if one of them null, return another
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        //define return var
        ListNode ret = new ListNode();

        //check if second list's first element is less, set it as first element of return var
        if (list2.val < list1.val) {
            ret.val = list2.val;
            list2 = list2.next;
        } else {
            ret.val = list1.val;
            list1 = list1.next;
        }

        //define another listnode
        ListNode temp = ret;

        //run until lists are not empty
        while (list1 != null && list2 != null) {
            if (list2.val < list1.val) {
                temp.next = new ListNode(list2.val);
                list2 = list2.next;
                temp = temp.next;
            } else {
                temp.next = new ListNode(list1.val);
                list1 = list1.next;
                temp = temp.next;
            }
        }

        while (list2 != null) {
            temp.next = new ListNode(list2.val);
            list2 = list2.next;
            temp = temp.next;
        }

        while (list1 != null) {
            temp.next = new ListNode(list1.val);
            list1 = list1.next;
            temp = temp.next;
        }

        return ret;
    }

//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {//slower
//        //check for null both listnodes, if null, return null
//        if (list1 == null && list2 == null) {
//            return null;
//        }
//
//        //if one of them null, return another
//        if (list1 == null) {
//            return list2;
//        }
//        if (list2 == null) {
//            return list1;
//        }
//
//        //add all elements to arraylist
//        List<Integer> list = new ArrayList<>();
//        while (true) {
//            list.add(list1.val);
//            list1 = list1.next;
//            if (list1 == null) {
//                break;
//            }
//            if (list1.next == null) {
//                list.add(list1.val);
//                break;
//            }
//        }
//        while (true) {
//            list.add(list2.val);
//            list2 = list2.next;
//            if (list2 == null) {
//                break;
//            }
//            if (list2.next == null) {
//                list.add(list2.val);
//                break;
//            }
//        }
//
//        //sort arraylist
//        Collections.sort(list);
//
//        //run through arraylist and add each element to listnode
//        ListNode listNode = new ListNode();
//        setListNode(list, 0, listNode);
//        return listNode;
//    }

    private void setListNode(List<Integer> list, int count, ListNode listNode) {
        if (count == list.size()) {
            return;
        }
        listNode.val = list.get(count);
        if (count != list.size() - 1) {
            listNode.next = new ListNode();
        }
        setListNode(list, count + 1, listNode.next);
    }
}