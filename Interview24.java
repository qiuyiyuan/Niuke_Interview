package com.qiuqiu.practice.interview;

public class Interview24 {
	public static void main(String[] args) {
		
	}
	public static int getLCA(int a, int b) {
        // write code here
		if(a==b) {
			return a;
		}else if(a<b){
			b/=2;
			return getLCA(a,b);
		}else {
			a/=2;
			return getLCA(a,b);
		}
    }
}
