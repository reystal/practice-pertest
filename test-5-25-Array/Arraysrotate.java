import java.util.Arrays;
public class Arraysrotate
{
    public static int [] rotate(int []nums,int k)
    {
        k= k%nums.length;
        int [] rightPart= Arrays.copyOfRange(nums,nums.length-k,nums.length);
        //System.out.println(Arrays.toString(rightPart));
        System.arraycopy(nums, 0, nums, k, nums.length-k);
        //System.out.prntln(Arrays.toString(nums));
        System.arraycopy(rightPart,0,nums,0,k);
        return nums;
    }
    public static void main(String [] args)
    {
        //数组右旋转
        int [] nums ={1,2,3,4,5};
        System.out .println(Arrays.toString(rotate(nums,3)));
    }
}