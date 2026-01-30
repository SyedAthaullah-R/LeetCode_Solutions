// Time Complexity: O(n)
public class removeDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;
        ListNode dummy = new ListNode(0, head);
        ListNode curr = head, node = head;
        while (curr.next != null) {
            if (curr.val != curr.next.val) {
                node.next = curr.next;
                node = node.next;
            }
            curr = curr.next;
        }
        node.next = null;
        return dummy.next;
    }
}
