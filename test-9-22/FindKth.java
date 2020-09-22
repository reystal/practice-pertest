import java.util.*;

public class Finder {
    public int findKth(int[] a, int n, int K) {
        // write code here
        return quickSort(a,0,n-1,K);
    }
    public int quickSort(int []a,int low,int high,int K)
    {
        int p= partion(a,low,high);
        if(K<p-low+1)
        {
            return quickSort(a,low,p-1,K);
        }
        else if(K>p-low+1)
        {
            return quickSort(a,p+1,high,K-(p-low+1));
        }
     return a[p];
    }
    public int partion(int []a,int left,int right)
    {
        int tmp=a[left];
            while(left<right)
            {
                while(left<right&&a[right]<tmp)
                {
                    right--;
                }
                if(left==right)
                {
                    break;
                }
                else
                {
                    a[left]=a[right];
                }
                while(left<right&&a[left]>=tmp)
                {
                    left++;
                }
                if(left==right)
                {
                    break;
                }
                else
                {
                    a[right]=a[left];
                }
            }
        a[left]=tmp;
        return left;
    }
}
