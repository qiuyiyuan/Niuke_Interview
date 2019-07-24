package com.qiuqiu.practice.interview.dataStructure;

/**
 * 平衡二叉树（AVL树）
 * @author Administrator
 *
 */
public class BinarySortTree {
	BinarySortTreeNode root;
	public void add(BinarySortTreeNode node) {
		if(root==null) {
			root=node;
		}else {
			root.add(node);
		}
	}
	public int height() {
		if(root==null) {
			return 0;
		}else {
			return root.height();
		}
	}
}
