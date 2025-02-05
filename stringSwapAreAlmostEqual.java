// Time Complexity: O(n)

public class stringSwapAreAlmostEqual {
    public boolean are_almost_Equal(String s1, String s2){
        if(s1.equals(s2)) return true;
        int count = 0;
        int[] diff = new int[2];
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                if(count == 2) return false;
                diff[count] = i;
                count++;
            }
        }
        return count == 2 && s1.charAt(diff[0]) == s2.charAt(diff[1]) && s1.charAt(diff[1]) == s2.charAt(diff[0]);
    }
    public static void main(String[] args) {
        stringSwapAreAlmostEqual a = new stringSwapAreAlmostEqual();
        System.out.println(a.are_almost_Equal("bank", "kanb"));
        
    }
}
