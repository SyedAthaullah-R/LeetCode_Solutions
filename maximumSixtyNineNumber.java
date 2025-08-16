// Time Complexity: O(n)
public class maximumSixtyNineNumber {
    public int Maximum_SixtyNine_Number(int num){
        char[] res = String.valueOf(num).toCharArray();
        for(int i = 0; i < res.length; i++){
            if(res[i] == '6'){
                res[i] = '9';
                break;
            }
        } return Integer.parseInt(String.valueOf(res));
    }
    public static void main(String[] args){
        maximumSixtyNineNumber a = new maximumSixtyNineNumber();
        System.out.println(a.Maximum_SixtyNine_Number(9669));
    }
}
