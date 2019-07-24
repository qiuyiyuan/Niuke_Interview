package com.qiuqiu.practice.interview;

public class Interview18 {
	public static void main(String[] args) {
		
	}
	public static boolean isBalance(TreeNode root) {
		if(root==null) {
			return true;
		}
		if(Math.abs(height(root.left)-height(root.right))>1) {
			return false;
		}else {
			return true;
		}
    }
	public static int height(TreeNode node) {
		if(node==null) {
			return 0;
		}
    	return Math.max(node.left==null?0:height(node.left),node.right==null?0:height(node.right))+1;
    }
}
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}
