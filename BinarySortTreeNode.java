package com.qiuqiu.practice.interview.dataStructure;

/**
 * 平衡二叉树（AVL树）节点
 * @author Administrator
 *
 */
public class BinarySortTreeNode {
	int val;
	BinarySortTreeNode left;
	BinarySortTreeNode right;
	public BinarySortTreeNode(int val) {
		this.val=val;
	}
	public int height() {
		return Math.max(this.left==null?0:this.left.height(),this.right==null?0:this.right.height())+1;
	}
	public int leftHeight() {
		if(this.left==null) {
			return 0;
		}else {
			return this.left.height();
		}
	}
	public int rightHeight() {
		if(this.right==null) {
			return 0;
		}else {
			return this.right.height();
		}
	}
	public void add(BinarySortTreeNode node) {
		if(node==null) {
			return;
		}
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
		//查询是否平衡
		if(this.leftHeight()-this.rightHeight()>=2) {
			if(this.left.leftHeight()<this.left.rightHeight()) {
				this.left.leftRotate();
			}
			this.rightRotate();
		}
		if(this.rightHeight()-this.leftHeight()>=2) {
			if(this.right.leftHeight()>this.right.rightHeight()) {
				this.right.rightRotate();
			}
			this.leftRotate();
		}
	}
	private void rightRotate() {
		BinarySortTreeNode newRight = new BinarySortTreeNode(this.val);
		newRight.right=this.right;
		newRight.left=this.left.right;
		this.val=this.left.val;
		this.left=this.left.left;
		this.right=newRight;
	}
	private void leftRotate() {
		BinarySortTreeNode newLeft = new BinarySortTreeNode(this.val);
		newLeft.left=this.left;
		newLeft.right=this.right.left;
		this.val=this.right.val;
		this.right=this.right.right;
		this.left=newLeft;
	}
	
}
