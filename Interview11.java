package com.qiuqiu.practice.interview;

public class Interview11 {
	public static void main(String[] args) {
		ListNode2 n1 = new ListNode2(6);
		ListNode2 n2 = new ListNode2(2);
		ListNode2 n3 = new ListNode2(8);
		n1.next=n2;
		n2.next=n3;
		ListNode2 newHead = partition(n1,9);
		while(newHead!=null) {
			System.out.println(newHead.val);
			newHead=newHead.next;
		}
	}
	
	public static ListNode2 partition(ListNode2 pHead, int x) {
        // write code here
		if(pHead==null||pHead.next==null) {
			return pHead;
		}
		ListNode2 currentNode = pHead;
		ListNode2 ltHead = new ListNode2(-1);
		ListNode2 gteHead = new ListNode2(-1);
		ListNode2 ltTemp = ltHead;
		ListNode2 gteTemp = gteHead;
        while(currentNode!=null){
            if(currentNode.val<x){
                ltTemp.next=new ListNode2(currentNode.val);
                ltTemp=ltTemp.next;
            }else{
            	gteTemp.next=new ListNode2(currentNode.val);
            	gteTemp=gteTemp.next;
            }
            currentNode=currentNode.next;
        }
        currentNode=ltHead;
        while(currentNode.next!=null) {
        	currentNode=currentNode.next;
        }
        currentNode.next=gteHead.next;
        return ltHead.next;
    }
	
}


