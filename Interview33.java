package com.qiuqiu.practice.interview;

public class Interview33 {
	public static void main(String[] args) {
		System.out.println(antsCollision(3));
	}
	public static double antsCollision(int n) {
		return 1-2.0/StrictMath.pow(2,n);
    }
}
