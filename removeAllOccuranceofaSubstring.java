// Time Complexity: O(n)

public class removeAllOccuranceofaSubstring {
    public String find_All_Occurance(String s, String part){
        StringBuilder sb = new StringBuilder(s);
        while(sb.indexOf(part) != - 1){
            int index = sb.indexOf(part);
            sb.delete(index, index + part.length());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        removeAllOccuranceofaSubstring a = new removeAllOccuranceofaSubstring();
        System.out.println(a.find_All_Occurance("daabcbaabcbc", "abc"));       
    }
}
