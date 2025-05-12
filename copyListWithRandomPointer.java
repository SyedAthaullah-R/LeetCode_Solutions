// Time Complexity: O(n)
class Node{
    int val;
    Node next;
    Node random;
    Node(int val){
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class copyListWithRandomPointer {
    public Node copy_List_with_Random_Pointer(Node head){
        if(head == null) return null;
        Node curr = head;
        while(curr != null){
            Node newNode = new Node(curr.val);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }
        curr = head;
        while(curr != null){
            if(curr.random != null) curr.next.random = curr.random.next;
            curr = curr.next.next;
        }
        curr = head;
        Node newHead = head.next;
        Node newCurr = newHead;
        while(curr != null){
            curr.next = newCurr.next;
            curr = curr.next;
            if(curr != null){
                newCurr.next = curr.next;
                newCurr = newCurr.next;
            }
        } return newHead;
    }
}
