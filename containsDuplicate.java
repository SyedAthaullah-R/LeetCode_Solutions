// The TIme Complexity:
// Best Case and Average Case: O(1) as we are using the hashset which takes one unit of time
// Worst Case: O(n)
import java.util.HashSet;

public class containsDuplicate { 
    public boolean contains_Duplicate(int[] nums){// This Approach runs upto 6 - 8ms
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(!set.add(i)) return true;
        }return false;
        
    }
   
    public static void main(String[] args) {
        containsDuplicate a = new containsDuplicate();
        int[] nums = {1, 2, 3, 1};
        System.out.println(a.contains_Duplicate(nums));
    }
}
