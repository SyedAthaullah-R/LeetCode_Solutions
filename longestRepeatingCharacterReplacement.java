// Time Complexity:  O(n)

public class longestRepeatingCharacterReplacement {
    public int longest_Repeating_character(String s, int k){
        int[] count = new int[26];
        int l = 0, maxf = 0, res = 0;
        for(int r = 0; r < s.length(); r++){
            int val = s.charAt(r) - 'A';
            count[val]++;
            maxf = Math.max(maxf, count[val]);
            while((r - l + 1) - maxf > k){
                val = s.charAt(l) - 'A';
                count[val]--;
                l++;
            }res = Math.max(res, r - l + 1);
        }return res;
    }
    public static void main(String[] args) {
        longestRepeatingCharacterReplacement a = new longestRepeatingCharacterReplacement();
        System.out.println(a.longest_Repeating_character("AABABBA", 1));
    }
}
