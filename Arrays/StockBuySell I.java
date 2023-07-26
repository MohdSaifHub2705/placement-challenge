class Solution {
    public int maxProfit(int[] prices) {

        // Brute force Approach runnin on two loop tc = o(n)2;
        // int maxProfit=0;

        // for(int i=0; i<prices.length; i++) {
        //     for(int j=i+1; j<prices.length; j++) {
        //         if(prices[j] > prices[i]) {
        //             maxProfit = Math.max(prices[j]-prices[i], maxProfit);
        //         }
        //     }
        // }
        // return maxProfit;


        // Optimize Approach

        int maxPro=0;
        int minPrice=Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxPro = Math.max(maxPro, prices[i]-minPrice);
        }
        return maxPro;
    }
}
