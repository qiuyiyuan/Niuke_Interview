package com.qiuqiu.practice.interview.dataStructure;

/**
 * 二叉排序树（二叉搜索树）节点
 * @author Administrator
 *
 */
public class BSTNode {
	public int val;
	public BSTNode left;
	public BSTNode right;
	public BSTNode(int val) {
		this.val=val;
	}
	public void add(BSTNode node) {
		if(node.val<=this.val) {
			if(this.left==null) {
				this.left=node;
			}else {
				this.left.add(node);
			}
		}else {
			if(this.right==null) {
				this.right=node;
			}else {
				this.right.add(node);
			}
		}
	}
}
