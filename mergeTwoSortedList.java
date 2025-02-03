// Time Complexity: O(n)
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class mergeTwoSortedList {
    public ListNode merge_Two_Sorted_List(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                node.next = list1;
                list1 = list1.next;
            }
            else{
                node.next = list2;
                list2 = list2.next;
            } node = node.next;
        }
        if(list1 != null) node.next = list1;
        else node.next = list2;
        return dummy.next;
    }
}
