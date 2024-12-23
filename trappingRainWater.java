// Time Complexity: O(n)

public class trappingRainWater {
    public int trapping_Rain_Water(int[] height){
        int l = 0, r = height.length - 1, res = 0;
        int leftMax = height[l], rightMax = height[r];
        while(l < r){
            if(leftMax < rightMax){
                l++;
                leftMax = Math.max(leftMax, height[l]);
                res += leftMax - height[l];
            }
            else{
                r--;
                rightMax = Math.max(rightMax, height[r]);
                res += rightMax - height[r];
            }
        }return res;
    }
    public static void main(String[] args) {
        trappingRainWater a = new trappingRainWater();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(a.trapping_Rain_Water(height));
    }
}
