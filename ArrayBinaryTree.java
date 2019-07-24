package com.qiuqiu.practice.interview.dataStructure;

public class ArrayBinaryTree {
	int[] data;
	public ArrayBinaryTree(int[] data) {
		this.data=data;
	}
	public void frontShow() {
		frontShow(0);
	}
	private void frontShow(int index) {
		if(data==null||data.length==0) {
			return;
		}
		System.out.println(data[index]);
		if((index*2+1)<data.length) {
			frontShow(index*2+1);
		}
		if((index*2+2)<data.length) {
			frontShow(index*2+2);
		}
	}
}
