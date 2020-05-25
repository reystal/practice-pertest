import java.util.Arrays;
public class partition
{
    public static void swap(int []a,int n,int m)
    {
        int t=a[n];
        a[n]=a[m];
        a[m]=t;
    }
    //方法一：
    public static int [] partition1(int [] nums)
    {
        //[begin,end] 区间内的数是未判断的数
        //[0，begin)偶数
        //[end,nums.length）奇数
        int begin =0;
        int end = nums.length-1;
        while(begin<end)
        {
            while (begin<end&&nums[begin]%2==0)
            {
                begin ++;
            }
            while(begin<end&&nums[end]%2!=0)
            {
                end --;
            }
            swap(nums, begin,end);
        }
        return nums;
    }
    //方法二:
    public static int[] partition2(int []nums)
    {
        int d=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                swap(nums,i,d);
                d++;
            }
        }
        return nums;
    }
    public static void main(String [] args)
    {
        //整一个数组，偶数在前，奇数在后
        int [] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(partition2(nums)));
    }
}
