// Time Complexity: O(n)
public class partitionList {
    public ListNode partion(ListNode head, int x) {
        ListNode dummy = new ListNode(0), temp = new ListNode(0);
        ListNode node = dummy, node1 = temp;
        ListNode curr = head;
        while (curr != null) {
            if (curr.val < x) {
                node.next = curr;
                node = node.next;
            } else {
                node1.next = curr;
                node1 = node1.next;
            }
            curr = curr.next;
        }
        node1.next = null;
        node.next = temp.next;
        return dummy.next;
    }
}
