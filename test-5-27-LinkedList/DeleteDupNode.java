// 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针
public class DeleteDupNode
{
    public static Node deleteDuplication(Node pHead)
    {
        if (pHead == null)
        {
            return null;
        }

        Node prev = null;
        Node p1 = pHead;
        Node p2 = pHead.next;

        while (p2 != null)
        {
            if (p1.val != p2.val)
            {
                prev = p1;
                p1 = p2;
                p2 = p2.next;
            }
            else
            {
                while (p2 != null && p2.val == p1.val)
                {
                    p2 = p2.next;
                }

                if (prev == null)
                {
                    pHead = p2;
                }
                else
                {
                    prev.next = p2;
                }
                p1 = p2;
                if (p2 != null)
                {
                    p2 = p2.next;
                }
            }
        }

        return pHead;
    }

    //创造链表
    public static Node createList()
    {
        Node n1 = new Node(1);
        Node n3 = new Node(2);
        Node n4 = new Node(2);
        Node n6 = new Node(3);
        Node n8 = new Node(3);
        Node n9 = new Node(3);
        Node n10= new Node(4);

        n1.next = n3;
        n3.next = n4;
        n4.next = n6;
        n6.next = n8;
        n8.next = n9;
        n9.next = n10;
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
        Node head = createList();//1 2 2 3 3 3 4
        System.out.print("初始链表：");
        print(head);
        Node result = deleteDuplication(head);
        System.out.print("删除所有重复结点后的链表：");
        print(result);
    }
}
