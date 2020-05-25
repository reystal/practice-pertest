public class Test
{
    //打印100~200之间的素数
    public static void printprime(int i)
    {
        int j=0;
        for(j=2;j<=i;j++)
        {
            if(i%j==0)
            {
                break;
            }
        }
        if(i==j)
        {
            System.out.print(i+" ");
        }
    }

    //判断1000~2000年的所有闰年
    public static void printleapYear(int year)
    {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
        {
            System.out.print(year+"    ");
        }
    }

    public static void main(String [] args)
    {
        System.out.println("打印素数：");
        for(int i=100;i<201;i++)
        {
            printprime(i);
        }
        System.out.println();
        System.out.println("打印闰年：");
        for (int year=1000;year<2001;year++)
        {
            printleapYear(year);
        }
    }
}
