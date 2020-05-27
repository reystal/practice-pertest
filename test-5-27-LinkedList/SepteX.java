//小于x的元素放在之前大于x的元素放在之后
public class SepteX
{
    public static Node partition(Node pHead, int x)
    {
        // < x
        Node less = null;
        Node lessLast = null;

        // >= x
        Node great = null;
        Node greatLast = null;

        Node cur = pHead;
        while (cur != null)
        {
            if (cur.val < x)
            {
                if (less == null)
                {
                    less = cur;
                }
                else
                {
                    lessLast.next = cur;
                }
                lessLast = cur;
            }
            else
            {
                if (great == null)
                {
                    great = cur;
                }
                else
                {
                    greatLast.next = cur;
                }
                greatLast = cur;
            }

            cur = cur.next;
        }

        if (less == null)
        {
            return great;
        }
        else
        {
            lessLast.next = great;
            if (greatLast != null)
            {
                greatLast.next = null;
            }

            return less;
        }
    }
    public static Node createTestList()
    {
        Node n1 = new Node(4);
        Node n2 = new Node(5);
        Node n3 = new Node(2);
        Node n4 = new Node(7);
        Node n5 = new Node(6);
        Node n6 = new Node(3);
        Node n7 = new Node(8);
        Node n8 = new Node(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;

        return n1;
    }
    public static void test()
    {
        // 4 5 2 7 6 3 8 1
        Node head = createTestList();
        System.out.print("初始链表：");
        for (Node cur = head; cur != null; cur = cur.next)
        {
            System.out.print(cur+"--->");
        }
        System.out.println("null");

        Node result = partition(head, 5);
        // 4 2 3 1 5 7 6 8
        System.out.print("以X区分后的链表：");
        for (Node cur = result; cur != null; cur = cur.next)
        {
            System.out.print(cur+"--->");
        }
        System.out.println("null");
    }

    public static void main(String[] args)
    {
        test();
    }
}
