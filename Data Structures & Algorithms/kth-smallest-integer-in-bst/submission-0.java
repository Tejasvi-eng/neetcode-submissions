/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int [] count=new int[]{k};//store k in array already
        int [] result=new int[1];
        dfs(root,count,result);
        return result[0];
            }
            public void dfs(TreeNode node , int[] count , int [] result){
                if(node==null) return ;
                dfs(node.left,count,result);
                count[0]--;
                if(count[0]==0){
                    result[0]=node.val;
                    return;
                }
                dfs(node.right,count,result);
            }
}
