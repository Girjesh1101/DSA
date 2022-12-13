package Practices;

public class Stock {
    
    public static int  maxProfit(int price[]){

        int buyPrice=Integer.MAX_VALUE;
        int MaxProfit=0;

        for (int i = 0; i < price.length; i++) {
            if(buyPrice<price[i]){

                int Profit= price[i]-buyPrice;
                MaxProfit= Math.max(MaxProfit, Profit);
            }
            else
                buyPrice=price[i];
        }

        return MaxProfit;
    }

    public static void main(String[] args) {
        
        int price[]={4,1,2,6};

        System.out.print(maxProfit(price));

    }
}
