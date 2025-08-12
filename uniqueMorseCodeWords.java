// Time Complexity: O(n)
import java.util.HashSet;

public class uniqueMorseCodeWords {
    public int Unique_Morse_Code_Repesentation(String[] words){
        HashSet<String> set = new HashSet<>();
        String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i = 0; i < words.length; i++){
            StringBuilder sb = new StringBuilder();
            for(char c : words[i].toCharArray())
                sb.append(code[c - 'a']);
            set.add(sb.toString());
        } return set.size();
    }
    public static void main(String[] args) {
        uniqueMorseCodeWords a = new uniqueMorseCodeWords();
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(a.Unique_Morse_Code_Repesentation(words));
    }
}
