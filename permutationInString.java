// Time Complexity: 
// Best Case: O(1)
// Average and Worst Case: O(n)
public class permutationInString {
    public boolean permutation_in_String(String s1, String s2){
        if(s1.length() > s2.length()) return false;
        int[] s1count = new int[26], s2count = new int[26];
        for(int i = 0; i < s1.length(); i++){
            s1count[s1.charAt(i) - 'a']++;
            s2count[s2.charAt(i) - 'a']++;
        }
        int matches = 0;
        for(int i = 0; i < 26; i++)
            if(s1count[i] == s2count[i]) matches++;
        int l = 0;
        for(int r = s1.length(); r < s2.length(); r++){
            if(matches == 26) return true;
            int val = s2.charAt(r) - 'a';
            s2count[val]++;
            if(s1count[val] == s2count[val]) matches++;
            else if(s1count[val] + 1 == s2count[val]) matches--;
            val = s2.charAt(l) - 'a';
            s2count[val]--;
            if(s1count[val] == s2count[val]) matches++;
            else if(s1count[val] - 1 == s2count[val]) matches--;
            l++;
        }return matches == 26;
    }
    public static void main(String[] args) {
        permutationInString a = new permutationInString();
        System.out.println(a.permutation_in_String("ab", "eidbaooo"));
    }
}
