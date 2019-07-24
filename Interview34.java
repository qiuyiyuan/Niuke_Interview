package com.qiuqiu.practice.interview;

public class Interview34 {
	public static void main(String[] args) {
		System.out.println(checkCrossLine(3.14,3.14,1,2));
	}
	public static boolean checkCrossLine(double s1, double s2, double y1, double y2) {
		return !(s1==s2&&y1!=y2);
    }
}
