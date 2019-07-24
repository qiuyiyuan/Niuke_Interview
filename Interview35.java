package com.qiuqiu.practice.interview;

public class Interview35 {
	public static void main(String[] args) {
		System.out.println(calc(1, 2, 1));
	}
	public static int calc(int a, int b, int type) {
		int result=0;
		if(type==1) {
			for(int i=0;i<b;i++) {
				result+=a;
			}
			return result;
		}else if(type==0) {
			int counts=0;
			while(a>0&&a>=b) {
				a=a+(~b)+1;
				counts++;
			}
			return counts;
		}else {
			result=a+(~b)+1;
			return result;
		}
	}
}
