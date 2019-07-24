package com.qiuqiu.practice.interview;

import java.util.ArrayList;

import com.qiuqiu.practice.interview.dataStructure.TreeNode;

public class Interview23 {
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
	}
	public static int findSucc(TreeNode root, int p) {
		list.clear();
		//System.out.println(list);
		midShow(root);
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==p) {
				if(i==list.size()-1) {
					return -1;
				}else {
					return list.get(i+1);
				}
			}
		}
		return -1;
    }
	public static void midShow(TreeNode node) {
		if(node==null) {
			return;
		}
		midShow(node.left);
		list.add(node.val);
		midShow(node.right);
	}
}
