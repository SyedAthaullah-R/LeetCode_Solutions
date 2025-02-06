// Time Complexity: O(n²)

import java.util.HashMap;

public class tuplewithSameProduct {
    private int nc2(int n){
        return (n * (n - 1)) / 2;
    }
    public int tuple_With_Same_Product(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int prod = 1;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                prod = nums[i] * nums[j];
                map.put(prod, map.getOrDefault(prod, 0) + 1);
            }
        }
        int count = 0;
        for(int freq : map.values()){
            count += 8 * nc2(freq);
        } return count;
    }
    public static void main(String[] args) {
        tuplewithSameProduct a = new tuplewithSameProduct();
        int[] nums = {2, 3, 4, 6};
        System.out.println(a.tuple_With_Same_Product(nums));
        
    }
}
