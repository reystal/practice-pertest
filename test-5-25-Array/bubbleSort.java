import java.util.Arrays;
public class bubbleSort
{
    //冒泡排序 
    //区间：前闭后闭
    public static void bubbleSort(int []a)
    {
        int n=a.length;
        for (int i=0;i<n;i++)
        {
            //无序[0，a.length -i]
            //有序[ a.length-i,a.length]
            //冒泡过程
            for(int j=1;j<n-i;j++)
            {
                if (a[j-1]>a[j])
                {
                    swap(a,j-1,j);
                }
            }
        }
    }
    //倒着排序
    public static void bubbleSort1(int []a)
    {
        for (int i=0;i<a.length;i++)
        {
            //无序[i，a.length）
            //有序[0，i）
            for(int j= a.length -1; j>i;j--)
                if (a[j]<a[j-1])
                {
                    swap(a,j,j-1);
                }
        }
    }
    //数组交换
    public static void swap(int []a,int n,int m)
    {
        int t=a[n];
        a[n]=a[m];
        a[m]=t;
    }

    public static void testbubbleSort(int []a)
    {
        System.out .println("排序前");
        System.out.println(Arrays.toString(a));
        //bubbleSort(a);
        bubbleSort1(a);
        System.out .println("排序后");
        System.out.println(Arrays.toString(a));
    }
    public static void main(String [] args)
    {
        //冒泡排序
        int [] a = {1,2,3,4,5,6,7};
        int [] b ={7,6,5,4,3,2,1};
        int [] c ={3,5,2,4,1,7,6};
        int [] d ={3,3,3,3,3,3,3};
        testbubbleSort(a);
        testbubbleSort(b);
        testbubbleSort(c);
        testbubbleSort(d);
    }
}