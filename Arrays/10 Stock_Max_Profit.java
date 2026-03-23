import java.util.Scanner;
class StockProfit {

    public static int cal_maxProfit(int prices[]){
        int buy_Price = Integer.MAX_VALUE;
        int max_Profit = 0;
        for (int i=0; i < prices.length; i++){
            if (buy_Price < prices[i]){
                int curr_profit = prices[i] - buy_Price;
                max_Profit = Math.max(curr_profit, max_Profit);
            }else {
                buy_Price = prices[i];
            }
        }
        return max_Profit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prices[] = new int[5];

        System.out.print("Enter Stock Prices of 5 Days : ");
        for (int i=0; i < prices.length; i++){
            prices[i] = sc.nextInt();
        }

        int max_Profit = cal_maxProfit(prices);
        System.out.print("Maximum Profit is : " + max_Profit);
    }
}
