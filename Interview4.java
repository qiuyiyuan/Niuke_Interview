package com.qiuqiu.practice.interview;

public class Interview4 {
	public static void main(String[] args) {
		System.out.println(replaceSpace("Mr John Smith",13));
	}
	
	public static String replaceSpace(String iniString, int length) {
        // write code here
		return iniString.replaceAll(" ", "%20");
    }
}
