class Node
{
    int val;
    Node next =null;
    Node(int val)
    {
        this.val=val;
        this.next=null;

    }
    public String toString()
    {
        return String.format("Node(%d)", val);
    }
}