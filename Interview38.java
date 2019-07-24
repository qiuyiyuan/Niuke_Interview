package com.qiuqiu.practice.interview;

public class Interview38 {
	public static void main(String[] args) {
		System.out.println(findKth(5));
	}
	public static int findKth(int k) {
		int counts=0;
		int i=3;
		for(;counts<k;i+=2) {
			if(suitable(i)) {
				counts++;
			}
		}
		return i-2;
    }
	/**
	 * 判断数是否符合题目要求，即素因子只有3,5,7
	 * @param number
	 * @return
	 */
	public static boolean suitable(int number) {
		boolean tag = true;
		for(int i=3;i<=number;i+=2) {
			//得到这个数的质数因子
			if(number%i==0 && isPrimeNumber(i)) {
				if(i!=3 && i!=5 && i!=7) {
					tag=false;
					break;
				}
			}
		}
		return tag;
	}
	/**
	 * 判断一个数是不是质数
	 * @param number
	 * @return
	 */
	public static boolean isPrimeNumber(int number) {
		if(number==2) {
			return true;
		}
		if(number%2==0) {
			return false;
		}
		boolean tag = true;
		for(int i=3;i<=Math.sqrt(number);i+=2) {
			if(number%i==0) {
				tag=false;
				break;
			}
		}
		return tag;
	}
}
