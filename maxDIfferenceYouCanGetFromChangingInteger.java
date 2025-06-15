// Time Complexity: O(n)
public class maxDIfferenceYouCanGetFromChangingInteger {
    public int maxDifference(int num){
        if(num <= 9) return 8;
        String a = Integer.toString(num), b = a;
        String x = "";
        for(char c : a.toCharArray()){
            if(c != '9'){
                x = String.valueOf(c);
                break;
            }
        }
        a = a.replaceAll(x, "9");
        String y = "";
        for(int i = 0; i < b.length(); i++){
            if(i == 0 && b.charAt(i) != '1'){
                y = String.valueOf(b.charAt(i));
                b = b.replaceAll(y, "1");
                break;
            }
            if(i > 0 && b.charAt(i) != b.charAt(0) && b.charAt(i) != '0'){
                y = String.valueOf(b.charAt(i));
                b = b.replaceAll(y, "0");
                break;
            }
        } return Integer.parseInt(a) - Integer.parseInt(b);
    }
    public static void main(String[] args) {
        maxDIfferenceYouCanGetFromChangingInteger a = new maxDIfferenceYouCanGetFromChangingInteger();
        System.out.println(a.maxDifference(555));
        
    }
}
