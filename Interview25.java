package com.qiuqiu.practice.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.qiuqiu.practice.interview.dataStructure.TreeNode;

public class Interview25 {
	static ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		TreeNode n1 = new TreeNode(5);
		root.left=n1;
		TreeNode n2 = new TreeNode(12);
		root.right=n2;
		TreeNode n3 = new TreeNode(4);
		TreeNode n4 = new TreeNode(7);
		n1.left=n3;
		n1.right=n4;
		FindPath(root,22);
		for(ArrayList<Integer> tempList:result) {
			for(Integer i:tempList) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	/**
	 * 
	 * @param root 树的根节点
	 * @param target 路径权之和
	 * @return
	 */
	public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
		result.clear();
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		findOnePath(root,0,target,tempList);
		MyComparator c = new MyComparator();
		Collections.sort(result,c);
		return result;
    }
	
	public static void findOnePath(TreeNode node,int sum,int target,ArrayList<Integer> list){
		if(node==null) {
			return;
		}
		list.add(node.val);
		sum+=node.val;
		//如果当前节点是叶子节点
		if(node.left==null&&node.right==null) {
			if(sum==target) {
				result.add(list);
				return;
			}else {
				return;
			}
		}else {//如果当前节点不是叶子节点
			findOnePath(node.left,sum,target,(ArrayList<Integer>)list.clone());
			findOnePath(node.right,sum,target,(ArrayList<Integer>)list.clone());
		}
		return;
	}
	
	static class MyComparator implements Comparator<ArrayList<Integer>>{
		@Override
		public int compare(ArrayList<Integer> l1,ArrayList<Integer> l2) {
			return l2.size()-l1.size();
		}
	}
}
