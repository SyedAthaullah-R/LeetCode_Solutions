// Time Complexity: O(n)
public class validWord {
    public boolean isValid(String word){
        if(word.length() < 3) return false;
        boolean hasVowel = false, hasConsonant = false;
        for(char c : word.toCharArray()){
            if(!Character.isLetterOrDigit(c)) return false;
            if(Character.isLetter(c)){
                char letter = Character.toLowerCase(c);
                if("aeiou".indexOf(letter) != - 1) hasVowel = true;
                else hasConsonant = true;
            }
        } return hasVowel && hasConsonant;
    }
    public static void main(String[] args) {
        validWord a = new validWord();
        System.out.println(a.isValid("234Adas"));
    }
}
