// Time Complexity:  O(n * log M)

public class kokoEatingBananas {
    private int findMax(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }return max;
    }
    private int findTotalHours(int[] arr, int hour){
        int totalHours = 0;
        for(int i = 0; i < arr.length; i++){
            totalHours += Math.ceil((double) arr[i] / hour); 
        }return totalHours;
    }
    public int koko_Eating_Bananas(int[] piles, int h){
        int l = 1, r = findMax(piles);
        while(l <= r){
            int mid = l + (r - l) / 2;
            int totalhours = findTotalHours(piles, mid);
            if(totalhours <= h) r = mid - 1;
            else l = mid + 1;
        }return l;
    }
    public static void main(String[] args) {
        kokoEatingBananas a = new kokoEatingBananas();
        int[] piles = {3, 6, 7, 11};
        System.out.println(a.koko_Eating_Bananas(piles, 8));
    }
}
