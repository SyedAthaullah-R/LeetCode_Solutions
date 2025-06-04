// Time Complexity: O(n)
class findTheLexicographicallyLargestStringInTheBox_I{
    public String findTheLexicographicalString(String word, int numFriends){
        if(numFriends == 1) return word;
        int n = word.length();
        String res = "";
        int longestPossible = n - numFriends + 1;
        for(int i = 0; i < n; i++){
            String curr = "";
            if(i + longestPossible <= n) curr = word.substring(i, i + longestPossible);
            else word.substring(i);
            if(curr.compareTo(res) > 0) res = curr;
        } return res;
    }
    public static void main(String[] args) {
        findTheLexicographicallyLargestStringInTheBox_I a = new findTheLexicographicallyLargestStringInTheBox_I();
        System.out.println(a.findTheLexicographicalString("dbca", 2));
    }
}