// Time Complexity: O(n)
import java.util.ArrayList;
import java.util.List;

public class findWordsContainingCharacters {
    public List<Integer> find_Words_Containing_Characters(String[] words, String x){
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            String s = words[i];
            if(s.indexOf(x) != - 1) res.add(i);
        } return res;
    }
    public static void main(String[] args) {
        findWordsContainingCharacters a = new findWordsContainingCharacters();
        String[] words = {"leet", "code"};
        System.out.println(a.find_Words_Containing_Characters(words, "e"));
    }
}
