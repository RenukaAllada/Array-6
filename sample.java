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
    //TC:0(N*K)
//SC:0(K)
    class Solution {
        public int maxProfit(int k, int[] prices) {
            if(prices==null || prices.length<=1){
                return 0;
            }
            int[] buy=new int[k];
            int[] sell=new int[k];
            Arrays.fill(buy,Integer.MAX_VALUE);

            for(int price:prices){
                for(int i=0;i<k;i++){
                    if(i==0){
                        buy[i]=Math.min(buy[i],price);
                    }else{
                        buy[i]=Math.min(buy[i],price-sell[i-1]);
                    }
                    sell[i]=Math.max(sell[i],price-buy[i]);
                }
            }
            return sell[k-1];
        }
    }
    /*****************PROBLEM-4************/
}