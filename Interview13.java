package com.qiuqiu.practice.interview;

import java.util.ArrayList;

public class Interview13 {
	public static void main(String[] args) {
		ListNode2 b1 = new ListNode2(1);
		ListNode2 b2 = new ListNode2(2);
		ListNode2 b3 = new ListNode2(3);
		ListNode2 b4 = new ListNode2(2);
		ListNode2 b5 = new ListNode2(3);
		b1.next=b2;
		b2.next=b3;
		b3.next=b4;
		b4.next=b5;
		System.out.println(isPalindrome(b1));
	}
	public static boolean isPalindrome(ListNode2 pHead) {
        // write code here
		boolean isPalindrome=true;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(pHead!=null) {
			list.add(pHead.val);
			pHead=pHead.next;
		}
		int low = 0;
		int high = list.size()-1;
		while(low<high) {
			if(list.get(low++)!=list.get(high--)) {
				isPalindrome=false;
				break;
			}
		}
		return isPalindrome;
    }
}
