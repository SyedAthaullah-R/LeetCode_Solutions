// Time Complexity: O(m + n)
import java.util.HashSet;
class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1(int val){
        this.val = val;
        this.next = null;
    }
    ListNode1(int val, ListNode1 node){
        this.val = val;
        this.next = node;
    }
}
public class deleteNodesFromLinkedListPresentInArray {
    public ListNode1 modifiedList(int[] nums, ListNode1 head){
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums)
            set.add(i);
        ListNode1 dummy = new ListNode1(0, head);
        ListNode1 prev = dummy, curr = head;
        while(curr != null){
            if(set.contains(curr.val)) prev.next = curr.next;
            else prev = prev.next;
            curr = curr.next;
        } return dummy.next;
    } 
}
