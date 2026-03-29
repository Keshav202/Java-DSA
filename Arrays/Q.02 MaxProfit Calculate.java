import java.util.Scanner;
class profit_calculate {

    public static int max_profit(int prices[]){
        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for (int i=0; i < prices.length; i++){
            if (buy_price < prices[i]){
                int curr_profit = prices[i] - buy_price;
                max_profit = Math.max(curr_profit, max_profit);
            }else {
                buy_price = prices[i];
            }
        }

        return max_profit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prices[] = new int[5];

        System.out.println("Enter Prices of 5 days Stocks : ");
        for (int i=0; i < prices.length; i++){
            prices[i] = sc.nextInt();
        }

        System.out.print("Maximum Profit = " + max_profit(prices));
    }
}
