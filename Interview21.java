package com.qiuqiu.practice.interview;

import java.util.ArrayList;

import com.qiuqiu.practice.interview.dataStructure.ListNode;

public class Interview21 {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(0);
		TreeNode left = new TreeNode(1);
		TreeNode right = new TreeNode(2);
		root.left=left;
		root.right=right;
		//left.left=new TreeNode(4);
		//right.left=new TreeNode(6);
		ListNode head = getTreeLevel(root,2);
		while(head!=null) {
			System.out.println(head.val);
			head=head.next;
		}
	}
	
	static ArrayList<ListNode> list = new ArrayList<ListNode>();
	
	public static ListNode getTreeLevel(TreeNode root, int dep) {
		if(dep==1) {
			return new ListNode(root.val);
		}
		list.clear();
		searchTreeLevel(root,dep,1);
		for(int i=0;i<list.size()-1;i++) {
			list.get(i).next=list.get(i+1);
		}
		return list.get(0);
	}
	
	private static void searchTreeLevel(TreeNode node, int dep, int currentDep) {
		if(dep==currentDep) {
			list.add(new ListNode(node.val));
			return;
		}
		if(node.left!=null) {
			searchTreeLevel(node.left,dep,currentDep+1);
		}
		if(node.right!=null) {
			searchTreeLevel(node.right,dep,currentDep+1);
		}
	}
}
