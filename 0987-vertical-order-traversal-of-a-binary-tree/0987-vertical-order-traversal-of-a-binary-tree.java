
import java.util.AbstractMap;
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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        
        if (root == null) {
            return ans;
        }
        
        // Map to store column -> list of [row, value] pairs
        Map<Integer, List<int[]>> map = new HashMap<>();
        
        // Queue for BFS: stores [TreeNode, column, row]
        Queue<Object[]> queue = new ArrayDeque<>();
        queue.offer(new Object[]{root, 0, 0}); // node, column, row
        
        int min = 0;
        int max = 0;
        
        while (!queue.isEmpty()) {
            Object[] current = queue.poll();
            TreeNode node = (TreeNode) current[0];
            int col = (int) current[1];
            int row = (int) current[2];
            
            if (node != null) {
                // Store row and value for this column
                if (!map.containsKey(col)) {
                    map.put(col, new ArrayList<>());
                }
                map.get(col).add(new int[]{row, node.val});
                
                min = Math.min(min, col);
                max = Math.max(max, col);
                
                // Add children with updated row and column
                queue.offer(new Object[]{node.left, col - 1, row + 1});
                queue.offer(new Object[]{node.right, col + 1, row + 1});
            }
        }
        
        // Build result by processing columns in order
        for (int i = min; i <= max; i++) {
            List<int[]> nodes = map.get(i);
            // Sort by row first, then by value if same row
            nodes.sort((a, b) -> {
                if (a[0] != b[0]) return a[0] - b[0]; // Sort by row
                return a[1] - b[1]; // Sort by value if same row
            });
            
            List<Integer> colResult = new ArrayList<>();
            for (int[] nodeInfo : nodes) {
                colResult.add(nodeInfo[1]); // Add the value
            }
            ans.add(colResult);
        }
        
        return ans;
    }
}