//返回倒数第K个结点的链表
public class FindKthToTail
{
    public  static Node FindKthToTail(Node head,int k)
    {
        int len = 0;
        for (Node c = head; c != null; c = c.next)
        {
            len++;
        }

        if (len < k)
        {
            return null;
        }

        int steps = len - k;
        Node r = head;
        for (int i = 0; i < steps; i++)
        {
            r = r.next;
        }
        return r;
    }
    public static Node FindKthToTai2(Node head,int k)
    {
        Node front = head;
        Node back = head;

        for (int i = 0; i < k; i++)
        {
            if (front == null)
            {
                return null;
            }
            front = front.next;
        }

        while (front != null)
        {
            back = back.next;
            front = front.next;
        }

        return back;
    }
    public static Node createList()
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
    public static void main (String [] args)
    {
        Node head=createList();
        System.out.print("初始链表：");
        print(head);
        Node result= FindKthToTai2( head,3);
        System.out.print("返回倒数第K个结点的链表：");
        print(result);
    }
}
