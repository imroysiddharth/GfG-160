package Array;

public class StockBuyAndSell_2 {
    public static int maximumProfit(int prices[]) {
        // Code here
        int profit  = 0 ;
        int diff = 0 ;
        int buy  = prices[0];
        for(int i=0; i<prices.length ; i++){
            if(prices[i]<buy){
                buy = prices[i];
                diff = 0 ;
            }
            else{
                diff = Math.max(prices[i]-buy ,  diff);
                profit = Math.max(diff,profit);
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[]={7, 10, 1, 3, 6, 9, 2};
        System.out.println(maximumProfit(arr));
    }
}