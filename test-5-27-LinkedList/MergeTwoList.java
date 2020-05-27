public class MergeTwoList
{
    //合并两个有序链表
    Node merge(Node head1, Node head2)
    {
        if (head1 == null)
        {
            return head2;
        }

        if (head2 == null)
        {
            return head1;
        }

        Node result = null;
        Node last = null;

        Node cur1 = head1;
        Node cur2 = head2;

        while (cur1 != null && cur2 != null)
        {
            if (cur1.val <= cur2.val)
            {
                if (result == null)
                {
                    result = cur1;
                } else
                {
                    last.next = cur1;
                }
                last = cur1;
                cur1 = cur1.next;
            }
            else
            {
                if (result == null)
                {
                    result = cur2;
                }
                else
                {
                    last.next = cur2;
                }
                last = cur2;
                cur2 = cur2.next;
            }
        }

        if (cur1 != null)
        {
            last.next = cur1;
        }
        else
        {
            last.next = cur2;
        }

        return result;
    }
    //有序链表1
    public static Node createList1()
    {
        Node n1 = new Node(1);
        Node n2 = new Node(2);

        n1.next = n2;

        return n1;
    }
    //有序链表2
    public static Node createList2()
    {
        Node n1 = new Node(1);
        Node n2 = new Node(3);
        Node n3 = new Node(5);
        Node n4 = new Node(7);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        return n1;
    }
    public  static void print(Node head)
    {
        for(Node cur=head;cur!=null;cur=cur.next)
        {
            System.out.print(cur.val+"-->");
        }
        System.out.println("null");
    }
    public static void main(String[] args)
    {
        Node head1= createList1();
        System.out.print("有序链表1：");
        print(head1);
        System.out.print("有序链表2：");
        Node head2=createList2();
        print(head2);
        //合并两个有序链表   //1 1 2 3 5 7
        Node merged = new MergeTwoList().merge(head1, head2);
        System.out.print("合并后的链表：");
        print(merged);
    }
}
