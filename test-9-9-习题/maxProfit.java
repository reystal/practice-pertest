import java.util.*;


public class Solution {
    /**
     * 
     * @param prices int整型一维数组 
     * @return int整型
     */
    public int maxProfit (int[] prices) {
        // write code here
        int length=prices.length;
        if(length<=0)
        {
            return 0;
        }
        int max=0;
        //外循环买价
        for(int i=0;i<length-1;i++)
        {
            //内循环卖价
            for(int j=i+1;j<length;j++)
            {
                max=(prices[j]-prices[i]>max?prices[j]-prices[i]:max);
            }
        }
        return max;
    }
}
