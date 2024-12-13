package solution.linkedlist.mergetwosortedlists;

import java.util.List;

public class ListNodeUitls {

    public static ListNode createSimpleLinkedList(List<Integer> list) {
        if (list.isEmpty()) {
            return new ListNode();
        }

        if (list.size() == 1) {
            return new ListNode(list.getFirst());
        }

        ListNode listNode = new ListNode(list.getFirst());
        ListNode copy = listNode;
        for (int i = 1; i < list.size(); i++) {
            copy.next = new ListNode(list.get(i));
            copy = copy.next;
        }

        return listNode;
    }
}
