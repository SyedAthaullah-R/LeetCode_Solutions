// Time Complexity: O(n)
import java.util.ArrayList;
import java.util.List;

public class summaryRanges {
    public List<String> Summary_Ranges(int[] nums){
        List<String> res = new ArrayList<>();
        if(nums.length == 0) return new ArrayList<>();
        int l = 0;
        for(int r = 0; r < nums.length - 1; r++){
            if(nums[r] + 1 != nums[r + 1]){
                if(nums[l] != nums[r]) res.add(nums[l] + "->" + nums[r]);
                else if(nums[l] == nums[r]) res.add(nums[l] + "");
                l = r + 1;
            }
        }
        if(nums[l] != nums[nums.length - 1]) res.add(nums[l] + "->" + nums[nums.length - 1]);
        else res.add(nums[l] + "");
        return res;
    }
    public static void main(String[] args){
        summaryRanges a = new summaryRanges();
        int[] nums = {0, 1, 2, 4, 5, 7};
        System.out.println(a.Summary_Ranges(nums));
    }
}
