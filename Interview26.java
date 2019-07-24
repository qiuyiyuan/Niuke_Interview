package com.qiuqiu.practice.interview;

public class Interview26 {
	public static void main(String[] args) {
		//1024 10000000000
		//  19     10011
		//     10001001100 1024+64+8+4=1100
		System.out.println(binInsert(1024,19,2,6));
		System.out.println(binInsert(4355,4,2,7));
	}
	public static int binInsert(int n, int m, int j, int i) {
        // write code here
		String result = Integer.toBinaryString(n);
		String insert = Integer.toBinaryString(m);
		System.out.println(result);
		System.out.println(insert);
		int len = result.length();
		int shift=insert.length();
		StringBuilder sb = new StringBuilder(result);
		sb.replace(len-j-shift,len-j,insert);
		System.out.println(sb.toString());
        return Integer.parseInt(sb.toString(),2);
    }
}
