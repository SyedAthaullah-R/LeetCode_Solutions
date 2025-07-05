// Time Complexity: O(n * k)
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class subStringWithAllConcatenationOfWords {
    public List<Integer> find_Substring(String s, String[] words){
        List<Integer> res = new ArrayList<>();
        if(s == null || s.length() == 0 || words.length == 0) return res;
        int wordLen = words[0].length();
        int totLen = wordLen * words.length;
        HashMap<String, Integer> wordCount = new HashMap<>();
        for(String i : words)
            wordCount.put(i, wordCount.getOrDefault(i, 0) + 1);
        for(int i = 0; i < wordLen; i++){
            int l = i, r = i;
            HashMap<String, Integer> seen = new HashMap<>();
            while(r + wordLen <= s.length()){
                String word = s.substring(r, r + wordLen);
                r += wordLen;
                if(wordCount.containsKey(word)){
                    seen.put(word, seen.getOrDefault(word, 0) + 1);
                    while(seen.get(word) > wordCount.get(word)){
                        String leftWord = s.substring(l, l + wordLen);
                        seen.put(leftWord, seen.getOrDefault(leftWord, 0) - 1);
                        l += wordLen;
                    }
                    if(r - l == totLen) res.add(l);
                }
                else{
                    seen.clear();
                    l = r;
                }
            }
        } return res;
    }
    public static void main(String[] args) {
        subStringWithAllConcatenationOfWords a = new subStringWithAllConcatenationOfWords();
        String[] words = {"foo", "bar"};
        System.out.println(a.find_Substring("barfoothefoobarman", words));
        
    }
}
