package com.qiuqiu.practice.interview;

public class Interview39 {
	public static void main(String[] args) {
		/*for(int i=1;i<=1000;i++) {
			System.out.print(countWays(i)+" ");
		}*/
		System.out.println(countWays(36196));
	}
	public static int countWays(int n) {
		if(n==1) {
			return 1;
		}
		if(n==2) {
			return 2;
		}
		if(n==3) {
			return 4;
		}
		long[] a = new long[n];
		a[0] = 1;
		a[1] = 2;
		a[2] = 4;
		for(int i=3;i<n;i++) {
			a[i]=a[i-1]+a[i-2]+a[i-3];
			a[i]%=1000000007;
			System.out.println(i+":"+a[i]);
		}
		return (int)a[n-1];
    }
}
