// Time Complexity: O(n)
import java.util.PriorityQueue;

public class kthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : nums){
            pq.offer(i);
            if(pq.size() > k) pq.poll();
        } return pq.peek();
    }
    public static void main(String[] args){
        kthLargestElementInAnArray a = new kthLargestElementInAnArray();
        int[] nums = {3, 2, 1, 5, 6, 4};
        System.out.println(a.findKthLargest(nums, 2));
    }
}
