// Time Complexity: O(n)
import java.util.HashMap;

public class findingPairsWithCertainSum {
    private int[] arr1;
    private int[] arr2;
    private HashMap<Integer, Integer> map;
    public findingPairsWithCertainSum(int[] nums1, int[] nums2){
        this.arr1 = nums1;
        this.arr2 = nums2.clone();
        map = new HashMap<>();
        for(int i : nums2)
            map.put(i, map.getOrDefault(i, 0) + 1);
    }
    public void add(int index, int val){
        int oldInd = arr2[index];
        map.put(oldInd, map.getOrDefault(oldInd, 0) - 1);
        arr2[index] += val;
        int newInd = arr2[index];
        map.put(newInd, map.getOrDefault(newInd, 0) + 1);
    }
    public int count(int tot){
        int count = 0;
        for(int i = 0; i < arr1.length; i++){
            int complement = tot - arr1[i];
            if(map.containsKey(complement)) count += map.get(complement);
        } return count;
    }
}
