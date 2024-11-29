// The Time Complexity:
// Best, Avaerage and Worst Case: O(n)
public class containerWithMostWater {
    public int coinatiner_with_water(int[] height){
        int p1 = 0;
        int p2 = height.length - 1;
        int max = 0;
        while(p1 < p2){
            int area = (p2 - p1) * Math.min(height[p1], height[p2]);
            if(max < area) max = area;
            else if(height[p1] <= height[p2]) p1++;
            else p2--;
        } return max;
    }
    public static void main(String[] args) {
        containerWithMostWater a = new containerWithMostWater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(a.coinatiner_with_water(height));
    }
}
