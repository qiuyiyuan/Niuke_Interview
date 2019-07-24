package com.qiuqiu.practice.interview;

public class Interview8 {
	public static void main(String[] args) {
		System.out.println(checkReverseEqual("Hello world","worldhello "));
		System.out.println(checkReverseEqual("waterbottle","erbottlewat"));
	}
	public static boolean checkReverseEqual(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		boolean isRotate=false;
		for(int i=1;i<=s1.length();i++) {
			String sub1=s1.substring(0,i);
			String sub2=s1.substring(i,s1.length());
			if((sub2+sub1).equals(s2)) {
				isRotate=true;
				break;
			}
		}
		return isRotate;
    }
}
