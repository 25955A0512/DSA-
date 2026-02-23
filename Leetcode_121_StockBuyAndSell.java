class Leetcode_121_StockBuyAndSell {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length==0){
            return 0;
        }
        int minprice=prices[0];
        int maxProfit=0;
        for(int i=1;i<prices.length;i++){
            int profitToday=prices[i] - minprice;
            maxProfit=Math.max(maxProfit,profitToday);
            minprice=Math.min(minprice, prices[i]);
        }
        return maxProfit;
    }
}