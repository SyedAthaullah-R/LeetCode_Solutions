// Time Complexity: O(n * k)
public class deleteColumnsToMakeSorted {
    public int minDeletionSize(String[] strs) {
        int n = strs[0].length(), count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) < strs[j - 1].charAt(i)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        deleteColumnsToMakeSorted a = new deleteColumnsToMakeSorted();
        String[] strs = { "cba", "daf", "ghi" };
        System.out.println(a.minDeletionSize(strs));
    }
}
