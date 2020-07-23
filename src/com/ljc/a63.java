package com.ljc;

public class a63 {
    public int maxProfit(int[] prices) {
        int max=0;
        int m=prices.length;
        if (prices==null||prices.length==0){
            return 0;
        }
        int min=prices[0];
        for (int i=0;i<m;i++){
            if (prices[i]<min){
                min=prices[i];
            }
            if (prices[i]-min>max){
                max=prices[i]-min;
            }
        }

        return max;
    }
}
