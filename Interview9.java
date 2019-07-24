package com.qiuqiu.practice.interview;

import java.util.ArrayList;
import java.util.Collections;

public class Interview9 {
	public static void main(String[] args) {
		ListNode2 n1 = new ListNode2(1);
		ListNode2 n2 = new ListNode2(2);
		ListNode2 n3 = new ListNode2(3);
		ListNode2 n4 = new ListNode2(4);
		ListNode2 n5 = new ListNode2(5);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		System.out.println(FindKthToTail(n1,1).val);
	}
	
	public static ListNode2 FindKthToTail(ListNode2 head,int k) {
		if(k<=0) {
			return null;
		}
		ArrayList<ListNode2> list = new ArrayList<ListNode2>();
		while(head!=null) {
			list.add(head);
			head=head.next;
		}
		Collections.reverse(list);
		return k>list.size()?null:list.get(k-1);
    }
}
class ListNode2 {
    int val;
    ListNode2 next = null;

    ListNode2(int val) {
        this.val = val;
    }
}