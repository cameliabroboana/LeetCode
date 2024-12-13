package solution.linkedlist.mergetwosortedlists;

/*
    21. Merge Two Sorted Lists

    You are given the heads of two sorted linked lists list1 and list2.
    Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
    Return the head of the merged linked list.
*/

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null; // ??
        }
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        if (list1.val < list2.val) {
            return mergeLists(list1, list2);
        } else {
            return mergeLists(list2, list1);
        }
    }

    private ListNode mergeLists(ListNode mergeInto, ListNode list) {
        ListNode index = mergeInto;
        ListNode prev = new ListNode();
        while (list != null && index != null) {
            if (list.val < index.val) {
                ListNode node = new ListNode(list.val);
                node.next = index;
                prev.next = node;
                list = list.next;
                prev = node;
            } else if (list.val == index.val) {
                ListNode node = new ListNode(list.val);
                node.next = index.next;
                index.next = node;
                list = list.next;
                prev = index;
            } else {
                prev = index;
                index = index.next;
            }
        }
        if (index == null) {
            prev.next = list;
        }
        return mergeInto;
    }


}
