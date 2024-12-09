// Time Complexity:
// Best, Average and Worst Case: O(n)
import java.util.HashSet;

public class containsDuplicate_ll {
    public boolean contains_Duplicate(int[] nums, int k){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
            if(set.size() > k) set.remove(nums[i - k]);
        }return false;
    }
    public static void main(String[] args) {
        containsDuplicate_ll a = new containsDuplicate_ll();
        int nums[] = {1,2,3,1};
        System.out.println(a.contains_Duplicate(nums, 3));
    }
}
