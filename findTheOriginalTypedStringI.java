// Time Complexity: O(n)
public class findTheOriginalTypedStringI {
    public int possibleStringCount(String word){
        int count = 1;
        for(int i = 1; i < word.length(); i++)
            if(word.charAt(i) == word.charAt(i - 1)) count++;
        return count;
    }
    public static void main(String[] args) {
        findTheOriginalTypedStringI a = new findTheOriginalTypedStringI();
        System.out.println(a.possibleStringCount("abbcccc"));
    }
}
