// Time Complexity: O(n)
public class removeDuplicatesFromSortedList_II {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy, curr = head;
        int currF = 1;
        while (curr.next != null) {
            if (curr.val == curr.next.val)
                currF++;
            if (curr.val != curr.next.val && currF == 1) {
                prev.next = curr;
                prev = prev.next;
            }
            if (curr.val != curr.next.val)
                currF = 1;
        }
        if (currF == 1)
            prev.next = curr;
        else
            prev.next = null;
        return dummy.next;
    }
}
