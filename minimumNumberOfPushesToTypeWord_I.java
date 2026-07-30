// Time Complexity: O(1)
public class minimumNumberOfPushesToTypeWord_I {
    public int minimumPushes(String word) {
        int[] res = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 14, 16, 18, 20, 22, 24, 27, 30, 33, 36, 39, 42, 45, 48, 52,
                56 };
        return res[word.length()];
    }

    public static void main(String[] args) {
        minimumNumberOfPushesToTypeWord_I a = new minimumNumberOfPushesToTypeWord_I();
        System.out.println(a.minimumPushes("abcde"));
    }
}
