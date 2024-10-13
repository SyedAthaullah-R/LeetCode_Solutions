/**
 * Solution_14
 */
public class Solution_14 {

    public static void main(String[] args) {
        LongestCommonPrefix a = new LongestCommonPrefix();
        String[] b = {"Flower","Flow","Flight"};
        System.out.println(a.LCP(b));
        
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