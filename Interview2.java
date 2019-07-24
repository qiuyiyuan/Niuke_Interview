package com.qiuqiu.practice.interview;

public class Interview2 {
	public static void main(String[] args) {
		System.out.println(reverseString("This is nowcoder"));
	}
	
	public static String reverseString(String iniString) {
		StringBuilder sb = new StringBuilder(iniString);
		return sb.reverse().toString();
    }
}
