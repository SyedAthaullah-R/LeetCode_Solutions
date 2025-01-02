// Time Complexity: 
// Best case: O(1)
// Average and Worst Case:  O(log(min(m, n)))
public class medianOfTwoSortedArrays {
    public double findMedianOfSortedArray(int[] nums1, int[] nums2){
        int[] A = nums1, B = nums2;
        if(A.length > B.length){
            int[] temp = A;
            A = B;
            B = temp;
        }
        int totalLength = A.length + B.length;
        int half = (totalLength + 1) / 2;
        int l = 0, r = A.length;
        while(l <= r){
            int i = (l + r) / 2;
            int j = half - i;
            int Aleft = i > 0 ? A[i - 1] : Integer.MIN_VALUE;
            int Aright = i < A.length ? A[i] : Integer.MAX_VALUE;
            int Bleft = j > 0 ? B[j - 1] : Integer.MIN_VALUE;
            int Bright = j < B.length ? B[j] : Integer.MAX_VALUE;
            if(Aleft <= Bright && Bleft <= Aright){
                if(totalLength % 2 != 0) return Math.max(Aleft, Bleft);
                return (Math.max(Aleft, Bleft) + Math.min(Aright, Bright)) / 2.0;
            }
            else if(Aleft > Bright) r = i - 1;
            else l = i + 1;
        }return 0;

    }
    public static void main(String[] args) {
        medianOfTwoSortedArrays a = new medianOfTwoSortedArrays();
        int[] nums1 = {1, 2}, nums2 = {3, 4};
        System.out.println(a.findMedianOfSortedArray(nums1, nums2));
    }
}
