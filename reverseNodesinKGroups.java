// Time Complexity: O(n)
public class reverseNodesinKGroups {
    public ListNode getKth(ListNode curr, int k){
        while(curr != null && k > 0){
            curr = curr.next;
            k--;
        } return curr;
    }
    public ListNode reverse_Nodes_in_K_Groups(ListNode head, int k){
        ListNode dummy = new ListNode(0, head);
        ListNode groupPrev = dummy;
        while(true){
            ListNode kth = getKth(groupPrev, k);
            if(kth == null) break;
            ListNode groupNext = kth.next;
            ListNode curr = groupPrev.next, prev = kth.next;
            while(curr != groupNext){
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            ListNode temp = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = temp;
        }
        return dummy.next;
    }
}
