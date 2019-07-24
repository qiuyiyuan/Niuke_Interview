package com.qiuqiu.practice.interview;

public class Interview12 {
	public static void main(String[] args) {
		ListNode2 a1 = new ListNode2(9);
		ListNode2 a2 = new ListNode2(2);
		ListNode2 a3 = new ListNode2(0);
		ListNode2 a4 = new ListNode2(7);
		a1.next=a2;
		a2.next=a3;
		a3.next=a4;
		ListNode2 b1 = new ListNode2(6);
		ListNode2 b2 = new ListNode2(3);
		ListNode2 b3 = new ListNode2(7);
		ListNode2 b4 = new ListNode2(9);
		ListNode2 b5 = new ListNode2(3);
		b1.next=b2;
		b2.next=b3;
		b3.next=b4;
		b4.next=b5;
		ListNode2 add = plusAB(a1,b1);
		while(add!=null) {
			System.out.println(add.val);
			add=add.next;
		}
	}
	
	public static ListNode2 plusAB(ListNode2 a, ListNode2 b) {
        // write code here
		//计算位数
		int countsA=0;
		int countsB=0;
		ListNode2 aTemp = a;
		ListNode2 bTemp = b;
		//计算a的位数
		while(aTemp!=null) {
			countsA++;
			aTemp=aTemp.next;
		}
		//计算b的位数
		while(bTemp!=null) {
			countsB++;
			bTemp=bTemp.next;
		}
		aTemp = a;
		bTemp = b;
		//得数的首节点
		ListNode2 plusResult=new ListNode2(-1);
		//得数的首节点副本，用于遍历
		ListNode2 plusResultTemp = plusResult;
		//标记是否进位
		int carryBit=0;
		//a的位数比b多，例如3,2,1 5,4 即123+45
		if(countsA>countsB) {
			while(bTemp!=null) {
				int sum = aTemp.val+bTemp.val+carryBit;
				if(sum>=10) {
					carryBit=1;
				}else {
					carryBit=0;
				}
				aTemp=aTemp.next;
				bTemp=bTemp.next;
				plusResultTemp.next=new ListNode2(sum%10);
				plusResultTemp=plusResultTemp.next;
			}
			while(aTemp!=null) {
				int sum =aTemp.val+carryBit;
				if(sum>=10) {
					carryBit=1;
				}else {
					carryBit=0;
				}
				aTemp=aTemp.next;
				plusResultTemp.next=new ListNode2(sum%10);
				plusResultTemp=plusResultTemp.next;
			}
			if(carryBit==1) {
				plusResultTemp.next=new ListNode2(1);
			}
		}else if(countsA<countsB) {
			while(aTemp!=null) {
				int sum = aTemp.val+bTemp.val+carryBit;
				if(sum>=10) {
					carryBit=1;
				}else {
					carryBit=0;
				}
				aTemp=aTemp.next;
				bTemp=bTemp.next;
				plusResultTemp.next=new ListNode2(sum%10);
				plusResultTemp=plusResultTemp.next;
			}
			while(bTemp!=null) {
				int sum =bTemp.val+carryBit;
				if(sum>=10) {
					carryBit=1;
				}else {
					carryBit=0;
				}
				bTemp=bTemp.next;
				plusResultTemp.next=new ListNode2(sum%10);
				plusResultTemp=plusResultTemp.next;
			}
			if(carryBit==1) {
				plusResultTemp.next=new ListNode2(1);
			}
		}else {
			while(aTemp!=null) {
				int sum = aTemp.val+bTemp.val+carryBit;
				if(sum>=10) {
					carryBit=1;
				}else {
					carryBit=0;
				}
				aTemp=aTemp.next;
				bTemp=bTemp.next;
				plusResultTemp.next=new ListNode2(sum%10);
				plusResultTemp=plusResultTemp.next;
			}
			if(carryBit==1) {
				plusResultTemp.next=new ListNode2(1);
			}
		}
		return plusResult.next;
	}
}
