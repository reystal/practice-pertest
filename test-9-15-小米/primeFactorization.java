import java.util.Scanner;

public class Main1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        primeFactorization(num);
    }

    private static void primeFactorization(int num)
    {
        if(isPrim(num)==true)
        {
            System.out.println(num);
        }
        else
        {
            for (int j = 2; j <num; j++)
            {
                while (num %j == 0)
                {
                    System.out.println(j);
                    num = num / j;
                }

            }
        }

    }
    public static boolean isPrim(int num)
    {
        double k = Math.sqrt(num * 1.0);
        for (int i = 2; i <= k; i++)
        {
            if (num%i==0)
            {
                return false;
            }
        }
        return true;
    }
}


