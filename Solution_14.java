/**
 * Solution_14
 */
public class Solution_14 {

    public static void main(String[] args) {
        LongestCommonPrefix a = new LongestCommonPrefix();
        System.out.println(a.LCP(new String[]{"Flowers","Flow","Flight"}));
        
    }
}
class LongestCommonPrefix{
    public String LCP(String[] strs){
        String prefix = strs[0];
        for(int i = 1; i<strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
}
