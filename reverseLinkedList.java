// Time Complexity: O(n)
// Note: I have implemented the entire Linked List. See the 11th line for the solution 
class LinkedList{
    int val;
    LinkedList next;
    LinkedList(int val){
        this.val = val;
        this.next = null;
    }
}
public class reverseLinkedList {
    public LinkedList reverse_Linked_List(LinkedList head){
        LinkedList curr = head;
        LinkedList prev = null;
        while(curr != null){
            LinkedList temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }return prev;
    }
    public void display(LinkedList head){
        LinkedList curr = head;
        while(curr != null){
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
        
        
    }
    public static void main(String[] args) {
        reverseLinkedList a = new reverseLinkedList();
        LinkedList head = new LinkedList(1);
        head.next = new LinkedList(2);
        head.next.next = new LinkedList(3);
        head.next.next.next = new LinkedList(4);
        head.next.next.next.next = new LinkedList(5);
        System.out.println("Original Linked List: ");
        a.display(head);
        LinkedList reversedNode = a.reverse_Linked_List(head);
        System.out.println("Reversed Linked List: ");
        a.display(reversedNode);
    }
}

