// Time Complexity: O(n²)

public class countPrefixAndSuffixPairs_I {
    public int count_Prefix_Suffix_Pairs(String[] words){
        int count = 0;
        for(int i = 0; i < words.length; i++){
            for(int j = i + 1; j < words.length; j++){
                if(words[j].startsWith(words[i]) && words[j].endsWith(words[i])) count++;
            }
        }return count;
    }
    public static void main(String[] args) {
        countPrefixAndSuffixPairs_I a = new countPrefixAndSuffixPairs_I();
        String[] words = {"pa", "papa", "ma", "mama"};
        System.out.println(a.count_Prefix_Suffix_Pairs(words));
    }
}
