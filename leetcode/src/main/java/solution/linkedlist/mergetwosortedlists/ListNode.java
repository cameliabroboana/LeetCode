package solution.linkedlist.mergetwosortedlists;

import java.util.Objects;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ListNode listNode)) return false;
        return val == listNode.val && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(val + " ");
        ListNode node = this.next;
        while (node!=null) {
            result.append(node.val).append(" ");
            node = node.next;
        }

        return result.toString();
    }
}
