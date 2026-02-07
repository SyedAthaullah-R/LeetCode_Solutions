// Time Complexity: O(n)
public class minimumDeletionsToMakeStringBalanced {
    public int minimumDeletions(String s) {
        int n = s.length();
        int[] aRightCount = new int[n], bLeftCount = new int[n];
        int aCount = 0, bCount = 0;
        for (int i = s.length() - 2; i >= 0; i--) {
            if (s.charAt(i + 1) == 'a')
                aCount++;
            aRightCount[i] = aCount;
        }
        for (int i = 1; i < bLeftCount.length; i++) {
            if (s.charAt(i - 1) == 'b')
                bCount++;
            bLeftCount[i] = bCount;
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++)
            res = Math.min(res, aRightCount[i] + bLeftCount[i]);
        return res;
    }

    public static void main(String[] args) {
        minimumDeletionsToMakeStringBalanced a = new minimumDeletionsToMakeStringBalanced();
        System.out.println(a.minimumDeletions("aababbab"));
    }
}
