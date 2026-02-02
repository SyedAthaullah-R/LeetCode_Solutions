public class rotateList {
    public ListNode getKth(ListNode node, int k) {
        int count = 1;
        while (node != null) {
            if (count == k)
                return node;
            node = node.next;
            count++;
        }
        return null;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0)
            return head;
        ListNode tailNode = head;
        int n = 1;
        while (tailNode.next != null) {
            tailNode = tailNode.next;
            n++;
        }
        if (k % n == 0)
            return head;
        tailNode.next = head;
        k %= n;
        ListNode newTailNode = getKth(head, n - k);
        head = newTailNode.next;
        newTailNode.next = null;
        return head;
    }
}
