// Time Complexity: O(n log n)
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public class couponCodeValidator {
    public boolean isValidString(String s){
        for(char c : s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c) || c == '_') continue;
            else return false;
        } return s.length() > 0;
    }
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isValid){
        List<String> res = new ArrayList<>();
        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();
        map.putIfAbsent("electronics", new ArrayList<>());
        map.putIfAbsent("grocery", new ArrayList<>());
        map.putIfAbsent("pharmacy", new ArrayList<>());
        map.putIfAbsent("restaurant", new ArrayList<>());
        for(int i = 0; i < code.length; i++){
            if(isValidString(code[i]) && map.containsKey(businessLine[i]) && isValid[i]){
                map.get(businessLine[i]).add(code[i]);
            }
        }
        for(String key : map.keySet()){
            Collections.sort(map.get(key));
            for(String ch : map.get(key))
                res.add(ch);
        } return res;
    }
    public static void main(String[] args){
        couponCodeValidator a = new couponCodeValidator();
        String[] code = {"SAVE20", "", "PHARMA5", "SAVE@20"}, businessLine = {"restaurant", "grocery", "pharmacy", "restaurant"};
        boolean[] isValid = {true, true, true, true};
        System.out.println(a.validateCoupons(code, businessLine, isValid));
    }
}
