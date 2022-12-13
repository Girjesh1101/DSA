package Practices;

public class StockProfit {
    
    public static int stockProfit(int stocks[]){

        int MaxProfit=0;
        int buyPrice= Integer.MAX_VALUE;

        for (int i = 0; i < stocks.length; i++) {
            
            if(buyPrice<stocks[i]){
            int profit= stocks[i]-buyPrice;
            MaxProfit= Math.max(MaxProfit, profit);
            }
            else{
                buyPrice= stocks[i];
            }
        }
        return MaxProfit;

    }
    public static void main(String[] args) {
        
        int stocks[]={1,5,6,3,21,8};
        System.out.println(stockProfit(stocks));

    }
}
