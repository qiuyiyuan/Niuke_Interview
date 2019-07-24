package com.qiuqiu.practice.interview;

import java.util.ArrayList;
import java.util.Stack;

public class Interview16 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		ArrayList<Integer> list = twoStacksSort(arr);
		for(Integer i:list) {
			System.out.println(i);
		}
	}
	public static ArrayList<Integer> twoStacksSort(int[] numbers) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Stack<Integer> initStack = new Stack<Integer>();
		for(int i=0;i<numbers.length;i++) {
			initStack.push(numbers[i]);
		}
		Stack<Integer> tempStack = new Stack<Integer>();
		while(!initStack.isEmpty()) {
			if(tempStack.isEmpty()) {
				tempStack.push(initStack.pop());
			}else {
				int insert = initStack.pop();
				while(!tempStack.isEmpty()&&insert<tempStack.peek()) {
					initStack.push(tempStack.pop());
				}
				tempStack.push(insert);
			}
		}
		while(!tempStack.isEmpty()) {
			list.add(tempStack.pop());
		}
		return list;
    }
}
