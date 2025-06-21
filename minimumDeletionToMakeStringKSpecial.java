// Time Complexity: O(n)
public class minimumDeletionToMakeStringKSpecial {
    public int minimumDeletions(String word, int k){
        int[] count = new int[26];
        for(char c : word.toCharArray())
            count[c - 'a']++;
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < count.length; i++){
            if(count[i] == 0) continue;
            int del = 0;
            int freqI = count[i];
            for(int j = 0; j < count.length; j++){
                if(j == i || count[j] == 0) continue;
                if(count[j] < freqI) del += count[j];
                else if(count[j] - count[i] > k) del += count[j] - (freqI + k);
            }
            res = Math.min(res, del);
        } return res;
    }
    public static void main(String[] args) {
        minimumDeletionToMakeStringKSpecial a = new minimumDeletionToMakeStringKSpecial();
        System.out.println(a.minimumDeletions("aabcaba", 0));
    }
}
