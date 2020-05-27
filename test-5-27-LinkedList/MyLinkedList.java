public class MyLinkedList
{
    public static void main(String[] args) 
	{
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next=new Node(3);
        print(head);

        Node node =new Node(2);
        Node pos = head.next.next;
        pushAfter(pos, 100);
        System.out.println("指定位置插入结点");
		print(head);
		 // 1, 2, 3, 100, 4
		popAfter(pos);
		print(head);
		//1, 2, 3,4
        System.out.println("删除指定元素4");
        removeElements(head,4);
        print(head);
        System.out.println("删除所有指定元素3");
		removeAll(head,3);
		print(head);
       
    }
	
    //指定位置插入结点
    private static void pushAfter(Node pos, int val) 
	{
        Node node = new Node(val);

        node.next = pos.next;
        pos.next = node;
    }
	
    //删除指定位置后的一个元素
    private static void popAfter(Node pos)
	{
        pos.next = pos.next.next;
    } 
	
	//删除指定元素
    private static Node removeElements(Node head, int val) 
	{
        Node result = null;
        Node last = null;   // 记录目前 result 中的最后一个结点

        Node cur = head;
        while (cur != null) 
		{
            if (cur.val == val) 
			{
                cur = cur.next;
                continue;
            }

            Node next = cur.next;

            cur.next = null;
            if (result == null) 
			{
                result = cur;
            } 
			else 
			{
                last.next = cur;//挂链
            }

            last = cur;
            cur = next;
        }
        return result;
    }

    //删除所有指定的元素
    public static Node removeAll(Node head, int val)
    {
        Node prev = null;
        Node cur = head;
        while (cur != null)
        {
            if (cur.val == val)
            {
                if (cur == head)
                {
                    head = cur.next;
                }
                else
                {
                    prev.next = cur.next;
                }
            }
            else
            {
                prev = cur;
            }
            cur = cur.next;
        }
        return head;
    }

	private static void print(Node head)
	{
		System.out.println("打印链表：");
		for (Node cur = head; cur != null; cur = cur.next)
		{
			System.out.print(cur + " --> ");
		}
		System.out.println("null");
	}
}




