public class Test
{
	
	private static Node pushFront(Node head,int val)
	{
		Node node = new Node(val);
        node.next=head;
        return node ;		
	}
	private static Node pushBack(Node head,int val)
	{
		Node node = new Node(val);
		if(head==null)
		{
			return node;
		}
		else
		{
			Node last=head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=node;
		}
		return head;
	}
	private static Node reverse(Node head)
	{
			Node result=null;
			Node cur=head;
			while(cur!=null)
			{
				Node next=cur.next;
				cur.next=result;
				result=cur;
				cur=next;
			}
			return result;
		
	}
	private  static void print(Node head)
	{
		System.out.println("打印链表：");
		for (Node cur = head; cur != null; cur = cur.next)
		{
			System.out.print(cur + " --> ");
		}
		System.out.println("null");
	}
	public static void main(String[] args) 
	{
		Node head = null;
		//头插
		head = pushFront(head, 0);
		head = pushFront(head, 1);
		head = pushFront(head, 2);
		
		// 打印
		print(head);	// 2 1 0
		
		
		//尾插
		head = pushBack(head, 10);
		head = pushBack(head, 20);
		head = pushBack(head, 30);
		print(head);	// 1 0 10 20 30
		
		//逆置链表
		head=reverse(head);//30 20 10 0 1
		print(head);
	}	
	
}