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
    public boolean findTarget(TreeNode root, int k) {

        HashSet<Integer> map = new HashSet<>();
        return helper(root , k ,set);        
    }

    private boolean helper(TreeNode node , int k , HashSet<Integer> set){
        if(node == null){
            return false;
        }

        if(set.contains(k - node.val)){
            return false;
        }
        set.put(node.val);

        return helper(node.left , k , set);
        return helper(node.right , k , set);
    }
    
}