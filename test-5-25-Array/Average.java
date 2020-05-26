public class Average
{
    public static void average(int [] a)
    {
        int sum =0;
        int max = a[0];
        int min = a[0];
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
            if(a[i]>max)
            {
                max=a[i];
            }
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        double ave =(double)(sum-max-min)/(a.length-2);
        System.out.println("最大值为:" +max);
        System.out.println("最小值为:"+min);
        System.out.println("总和为："+sum);
        System.out.println("平均值为:"+ave);
    }
    public static void main(String [] args)
    {
        //去掉一个最大值和最小值的平均值
        int []a = {1,2,3,4,5};
        average(a);
    }
}