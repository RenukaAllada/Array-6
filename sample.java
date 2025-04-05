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
    //TC:0(n)
//sc:0(1)
    class Solution {
        public int maxProfit(int[] prices) {
            if(prices.length<=1 || prices==null){
                return 0;
            }
            int buy1=Integer.MAX_VALUE,sell1=0,buy2=Integer.MAX_VALUE,sell2=0;
            for(int price:prices){
                buy1=Math.min(buy1,price);
                sell1=Math.max(sell1,price-buy1);
                buy2=Math.min(buy2,price-sell1);
                sell2=Math.max(sell2,price-buy2);
            }
            return sell2;
        }
    }

    /*****************PROBLEM-3************/
    /*****************PROBLEM-4************/
}