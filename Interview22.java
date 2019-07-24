package com.qiuqiu.practice.interview;

import java.util.ArrayList;

import com.qiuqiu.practice.interview.dataStructure.BST;
import com.qiuqiu.practice.interview.dataStructure.BSTNode;

public class Interview22 {
	public static void main(String[] args) {
		BST bst = new BST();
		bst.add(new BSTNode(7));
		bst.add(new BSTNode(6));
		bst.add(new BSTNode(4));
		bst.add(new BSTNode(2));
		bst.add(new BSTNode(5));
		bst.add(new BSTNode(1));
		bst.add(new BSTNode(3));
		System.out.println(checkBST(bst.root));
	}

	static ArrayList<Integer> list = new ArrayList<Integer>();

	public static boolean checkBST(BSTNode root) {
		if (adjustFormalRegular(root)) {
			if (root.left == null && root.right == null) {
				return true;
			} else if (root.left == null) {
				return checkBST(root.right);
			} else if (root.right == null) {
				return checkBST(root.left);
			} else {
				if (root.val >= root.left.val && root.val <= root.right.val) {
					return checkBST(root.left) && checkBST(root.right);
				} else {
					return false;
				}
			}
		} else {
			return false;
		}
	}

	public static boolean adjustFormalRegular(BSTNode root) {
		if(root==null) {
			return true;
		}
		list.clear();
		midShow(root.left);
		for (Integer i : list) {
			if (root.val < i) {
				return false;
			}
		}
		list.clear();
		midShow(root.right);
		for (Integer i : list) {
			if (root.val > i) {
				return false;
			}
		}
		return adjustFormalRegular(root.left) && adjustFormalRegular(root.right);
	}

	public static void midShow(BSTNode root) {
		if (root == null) {
			return;
		}
		midShow(root.left);
		list.add(root.val);
		midShow(root.right);
	}
}
