// Time COmplexity
// Best, Average and Worst Case: O(n)
public class singleElement {
    public int single_Element(int nums[]){
        int res = 0;
        for(int i : nums) res ^= i;
        return res;
    }
    public static void main(String[] args) {
        singleElement a = new singleElement();
        int[] nums = {4,1,2,1,2};
        System.out.println(a.single_Element(nums));
    }
}
