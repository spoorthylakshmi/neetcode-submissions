class Solution {
    public int maxProfit(int[] prices) {
      int maxprofit=0;
      int minprice=prices[0];
      for(int i=0;i<prices.length;i++)
        {
          int currentp=prices[i];
          minprice=Math.min(minprice,currentp);
          int profit=currentp-minprice;
          maxprofit=Math.max(maxprofit,profit);
        }
        return maxprofit;
    }
}
