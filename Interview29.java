package com.qiuqiu.practice.interview;

public class Interview29 {
	public static void main(String[] args) {
		System.out.println(calcCost(10,5));
	}
	public static int calcCost(int A, int B) {
		String aStr = Integer.toBinaryString(A);
		String bStr = Integer.toBinaryString(B);
		StringBuilder sb = new StringBuilder();
		char[] aCharArray;
		char[] bCharArray;
		int counts=0;
		int length=aStr.length();
		if(aStr.length()==bStr.length()) {
			aCharArray = aStr.toCharArray();
			bCharArray = bStr.toCharArray();
			for(int i=0;i<length;i++) {
				if(aCharArray[i]!=bCharArray[i]) {
					counts++;
				}
			}
		}else if(aStr.length()>bStr.length()) {
			for(int i=0;i<(aStr.length()-bStr.length());i++) {
				sb.append(0);
			}
			sb.append(bStr);
			aCharArray = aStr.toCharArray();
			bCharArray = sb.toString().toCharArray();
			for(int i=0;i<length;i++) {
				if(aCharArray[i]!=bCharArray[i]) {
					counts++;
				}
			}
			
		}else {
			length=bStr.length();
			for(int i=0;i<(bStr.length()-aStr.length());i++) {
				sb.append(0);
			}
			sb.append(aStr);
			aCharArray = sb.toString().toCharArray();
			bCharArray = bStr.toCharArray();
			for(int i=0;i<length;i++) {
				if(aCharArray[i]!=bCharArray[i]) {
					counts++;
				}
			}
		}
		return counts;
    }
}
