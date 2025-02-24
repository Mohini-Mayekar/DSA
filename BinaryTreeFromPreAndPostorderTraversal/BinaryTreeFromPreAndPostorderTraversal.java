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
    

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int n = preorder.length - 1;
               
        return helper(0, n, 0, n, preorder, postorder);
        
    }

    private TreeNode helper(int preStart, int preEnd, int postStart, int postEnd, int[] preorder, int[] postorder){
        //base
        if(preStart == preEnd) return new TreeNode(preorder[preStart]); 
        if(preStart > preEnd)return null;
    

        //logic
        TreeNode node = new TreeNode(preorder[preStart]);
        int rightNodeIdxPre = findNode(preorder,preStart, preEnd, postorder[postEnd - 1]);
        //System.out.println(rightNodeIdxPre);
        int leftEle = (rightNodeIdxPre - 1) - (preStart + 1) + 1;
        int rightEle = (preEnd - rightNodeIdxPre + 1);
        
        //recurse
        node.left = helper(preStart + 1, rightNodeIdxPre - 1, postStart, postStart + leftEle - 1, preorder, postorder);
        node.right = helper(rightNodeIdxPre, preEnd, postStart + leftEle , postEnd - 1, preorder, postorder);

        return node;
    }


    public int findNode(int[] array, int start, int end, int target){
        
        for(int i = start; i <= end; i++){
            if(array[i] == target)return i;
        }
        return -1;
    }
}