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
    //找到链表中间节点
    public ListNode getMid(ListNode head)
    {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    //逆置链表
    public ListNode reverse(ListNode head)
    {
        ListNode result=null;
        ListNode cur=head;
        while(cur!=null)
        {
            ListNode next=cur.next;
            cur.next=result;
            result=cur;
            cur=next;
        }
        return result;
    }
    public boolean isPail (ListNode head) 
    {
       ListNode mid=getMid(head);
       ListNode h2=reverse(mid);
        ListNode n1=head;
        ListNode n2=h2;
        while(n1!=null&&n2!=null)
        {
            if(n1.val!=n2.val)
            {
                return false;
            }
            n1=n1.next;
            n2=n2.next;
        }
        return true;
    }
}
