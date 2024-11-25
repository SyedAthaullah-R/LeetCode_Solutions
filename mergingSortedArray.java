import java.util.Arrays;

public class mergingSortedArray {
    public void merge_Sorted_Array(int[] nums1, int[]nums2, int m, int n){
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n -1;
        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1] > nums2[p2]){
                nums1[p] = nums1[p1];
                p1--;
            }else{
                nums1[p] = nums2[p2];
                p2--;
            }p--;
        }
        while(p2 >= 0){
            nums1[p] = nums2[p2];
            p--;
            p2--;
        }
        System.out.println(Arrays.toString(nums1));
    }
    public static void main(String[] args) {
        mergingSortedArray a = new mergingSortedArray();
        int[] nums1 = {4,5,6,0,0,0};
        int[] nums2 = {1,2,3};
        a.merge_Sorted_Array(nums1, nums2, 3, 3);
        
    }
    
}
