package com.qiuqiu.practice.interview.dataStructure;

/**
 * 二叉排序树（二叉搜索树）
 * @author Administrator
 *
 */
public class BST {
	public BSTNode root;
	public void add(BSTNode node) {
		if(root==null) {
			root=node;
		}else {
			root.add(node);
		}
	}
}
