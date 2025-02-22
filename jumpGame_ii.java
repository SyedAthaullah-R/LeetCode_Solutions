// Time Complexity: O(n)
public class jumpGame_ii {
    public int jump_Game_ii(int[] nums){
        int l = 0, r = 0, jumps = 0;
        while(r < nums.length - 1){
            int farthest = 0;
            for(int i = l; i <= r; i++)
                farthest = Math.max(farthest, i + nums[i]);
            l = r + 1;
            r = farthest;
            jumps++;
        } return jumps;
    }
    public static void main(String[] args) {
        jumpGame_ii a = new jumpGame_ii();
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(a.jump_Game_ii(nums));
    }
}
