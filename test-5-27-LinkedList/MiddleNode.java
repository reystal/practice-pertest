//从链表的中间结点开始返回
public class MiddleNode
{
    public static int getLength(Node head)
    {
        int len = 0;
        for (Node cur = head; cur != null; cur = cur.next)
        {
            len++;
        }

        return len;
    }
    public static Node middleNode(Node head)
    {
        int len = getLength(head);
        int midLen = len / 2;
        Node node = head;
        for (int i = 0; i < midLen; i++)
        {
            node = node.next;
        }

        return node;
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
    public static void main (String [] args)
    {
        Node head = createTestList();
        //4 5 2 7 6 3 8 1；
        System.out.print("初始链表：");
        for (Node cur = head; cur != null; cur = cur.next)
        {
            System.out.print(cur.val+"--->");
        }
        System.out.println("null");

        Node result= middleNode( head);
        //6 3 8 1
        System.out.print("从中间结点返回的链表：");
        for (Node cur = result; cur != null; cur = cur.next)
        {
            System.out.print(cur.val+"--->");
        }
        System.out.println("null");

    }
}

