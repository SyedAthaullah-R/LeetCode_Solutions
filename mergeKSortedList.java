// Time Complexity: O(nk)
public class mergeKSortedList {
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                node.next = l1;
                l1 = l1.next;
            }
            else{
                node.next = l2;
                l2 = l2.next;
            } node = node.next;
        }
        if(l1 != null) node.next = l1;
        else node.next = l2;
        return dummy.next;
    }
    public ListNode merge_K_Sorted_List(ListNode[] lists){
        if(lists.length == 0) return null;
        for(int i = 1; i < lists.length; i++)
            lists[i] = merge(lists[i], lists[i - 1]);
        return lists[lists.length - 1];
    }
}
