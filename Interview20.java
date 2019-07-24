package com.qiuqiu.practice.interview;

import com.qiuqiu.practice.interview.dataStructure.BinarySortTree;
import com.qiuqiu.practice.interview.dataStructure.BinarySortTreeNode;

public class Interview20 {
	public static void main(String[] args) {
		int[] vals = {50,60,45,47,40,30};
		System.out.println(buildMinimalBST(vals));
	}
	
	public static int buildMinimalBST(int[] vals) {
		BinarySortTree bst = new BinarySortTree();
		for(int i=0;i<vals.length;i++) {
			bst.add(new BinarySortTreeNode(vals[i]));
		}
		return bst.height();
    }
}

