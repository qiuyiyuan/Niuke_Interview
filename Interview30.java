package com.qiuqiu.practice.interview;

public class Interview30 {
	public static void main(String[] args) {
		System.out.println(exchangeOddEven(10));
	}
	public static int exchangeOddEven(int x) {
		String str = Integer.toBinaryString(x);
		if(str.length()%2!=0) {
			str="0"+str;
		}
		char[] chas = str.toCharArray();
		for(int i=0;i<chas.length;i+=2) {
			char temp = chas[i];
			chas[i]=chas[i+1];
			chas[i+1]=temp;
		}
		String result = new String(chas);
		return Integer.parseInt(result,2);
    }
}
