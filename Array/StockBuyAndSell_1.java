package Array;

public class StockBuyAndSell_1 {
    public static int maximumProfit(int prices[]) {
        // code here
        int Profit = 0 ;
        for(int i=1; i<prices.length ; i++){
            if(prices[i]>prices[i-1]){
                Profit += prices[i]-prices[i-1];
            }
        }
        return Profit;
    }
    public static void main(String[] args) {
        int arr[]={100, 180, 260, 310, 40, 535, 695};
        System.out.println(maximumProfit(arr));
    }
}
