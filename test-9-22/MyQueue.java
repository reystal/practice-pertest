import java.util.Stack;
public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) 
    {
       stack1.add(node);
    }
    
    public int pop() 
    {
        if(stack2.isEmpty())
        {
            int size=stack1.size();
            for(int i=0;i<size;i++)
            {
                int v=stack1.remove(stack1.size()-1);
                 stack2.add(v);
            }
        }
        return stack2.remove(stack2.size()-1);
    }
}
