// Time Complexity: O(n)
import java.util.PriorityQueue;

public class MinimumOperationstoExceedThresholdValueII {
    public int minimum_Operation_Threshold(int[] nums, int k){
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        for(long i : nums)
            minHeap.add(i);
        int count = 0;
        while(!minHeap.isEmpty()){
            long l1 = minHeap.poll();
            if(l1 >= k) break;
            long l2 = minHeap.peek();
            minHeap.poll();
            minHeap.add(Math.min(l1, l2) * 2 + Math.max(l1, l2));
            count++;
        } return count;
    }
    public static void main(String[] args) {
        MinimumOperationstoExceedThresholdValueII a = new MinimumOperationstoExceedThresholdValueII();
        int[] nums = {2, 11, 10, 1, 3};
        System.out.println(a.minimum_Operation_Threshold(nums, 10));
        
    }
}
