// Time Complexity:     O(n)
public class candy {
    public int Candy(int[] ratings){
        int[] res = new int[ratings.length];
        for(int i = 0; i < res.length; i++)
            res[i] = 1;
        int total = 0;
        for(int i = 1; i < res.length; i++){
            if(ratings[i] > ratings[i - 1]) res[i] = res[i - 1] + 1;
        }
        for(int i = res.length - 2; i >= 0; i--){
            if(ratings[i] > ratings[i + 1]) res[i] = Math.max(res[i], res[i + 1] + 1);
        }
        for(int i : res)
            total += i;
        return total;
    }
    public static void main(String[] args) {
        candy a = new candy();
        int[] ratings = {1, 0, 2};
        System.out.println(a.Candy(ratings));
    }
}