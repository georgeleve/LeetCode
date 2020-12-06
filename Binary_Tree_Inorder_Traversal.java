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
    public List<Integer> inorderTraversal(TreeNode root) {
       List<Integer> res = new ArrayList<>();
       Stack<TreeNode> stack = new Stack<>();
       TreeNode current = root;
       while(current != null || !stack.isEmpty()){
           while(current != null) { //left
               stack.push(current);
               current = current.left;
           }
           current = stack.pop(); // Top
           res.add(current.val);    // Right
           current = current.right;
       }
       return res;   
    }
}
