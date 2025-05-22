//  Time Complexity: O(n)
public class reverseLinkedList_II {
    private ListNode getPos(ListNode curr, int n){
        while(n > 0){
            curr = curr.next;
            n--;
        } return curr;
    }
    public ListNode reverse_LinkedList_II(ListNode head, int left, int right){
        if(left == right) return head;
        ListNode dummy = new ListNode(0, head);
        ListNode leftPrev = getPos(dummy, left - 1);
        ListNode curr = leftPrev.next, prev = null;
        for(int i = 0; i <= right - left; i++){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        leftPrev.next.next = curr;
        leftPrev.next = prev;
        return dummy.next;
    }
}
