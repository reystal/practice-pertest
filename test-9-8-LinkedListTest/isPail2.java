import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

public class Solution {
    /**
     * 
     * @param head ListNode类 the head
     * @return bool布尔型
     */
    public boolean isPail (ListNode head) {
        // write code here
        ArrayList<Integer> list=new ArrayList<>();
        ListNode cur=head;
        while(cur!=null)
        {
            list.add(cur.val);
            cur=cur.next;
        }
        int l=0;
        int r=list.size()-1;
        while(l<r)
        {
            if(!list.get(l).equals(list.get(r)))
            {
                return false;
            }
            else
            {
                l++;
                r--;
            }
        }
        return true;
    }
}
