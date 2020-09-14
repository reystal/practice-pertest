import java.util.*;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 * }
 */

public class Solution 
{
    /**
     * 
     * @param root TreeNode类 
     * @return int整型ArrayList<ArrayList<>>
     */
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) 
    {
        // write code here
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        if(root!=null)
        {
            Queue<TreeNode> queue=new LinkedList<>();
            queue.offer(root);//根节点入队
            while(!queue.isEmpty())
            {
                int size=queue.size();//本次要出队的节点数量
                //存放每一层的节点
                ArrayList<Integer> list=new ArrayList<Integer>();
                for(int i=0;i<size;i++)
                {
                    //上层节点
                    TreeNode tmp=queue.poll();
                    list.add(tmp.val);
                    //下层节点入队
                    if(tmp.left!=null)
                    {
                        queue.offer(tmp.left);
                    }
                    if(tmp.right!=null)
                    {
                        queue.offer(tmp.right);
                    }
                }
              //保存当前结果
            result.add(list);
            }
        }
        return result;
    }
}
