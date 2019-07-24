package com.qiuqiu.practice.interview;

/**
 * x+y<=12
 * @author Administrator
 *
 */
public class Interview40 {
	public static void main(String[] args) {
		System.out.println(countWays(3,9));
	}
	/**
	 * 向右走x次，向下走y次
	 * @param x
	 * @param y
	 * @return
	 */
	public static int countWays(int x, int y) {
		return x<y?C(x-1,x+y-2):C(y-1,x+y-2);
    }
	public static int C(int sub,int sup) {
		int ans=1;
		for(int i=0;i<sub;i++) {
			ans*=sup;
			sup--;
		}
		for(int i=sub;i>1;i--) {
			ans/=i;
		}
		return ans;
	}
}
