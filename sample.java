class sample{
    /*****************PROBLEM-1************/
    //tc:0(n)
//sc:0(1)
    class Solution {
        public int maxProfit(int[] prices) {
            if(prices==null || prices.length<=1){
                return 0;
            }
            int min=Integer.MAX_VALUE,maxProfit=0;
            for(int price:prices){
                min=Math.min(price,min);
                maxProfit=Math.max(maxProfit,price-min);
            }
            return maxProfit;
        }
    }
    /*****************PROBLEM-2************/
    
}