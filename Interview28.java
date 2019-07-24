package com.qiuqiu.practice.interview;

public class Interview28 {
	public static void main(String[] args) {
		int[] vector = getCloseNumber(76351);
		System.out.println(vector[0]+" "+vector[1]);
	}
	
	/**
	 * 题目保证有答案，不用考虑特殊情况，比如1111
	 * 找到最接近的较大数：将最右边的01替换为10，若遇到1110这种情况，在前面补0
	 * 找到最接近的较小数：将最右边的10替换为01
	 * 11110->30
	 * 11101->29
	 * 101110->46
	 * 10010101000111111 67
	 * 10010100100111111
	 * 10010100111111100
	 * @param x
	 * @return
	 */
	public static int[] getCloseNumber(int x) {
        // write code here
		int[] a = new int[2];
		String s = Integer.toBinaryString(x);
		a[0]=getCloseNumber1(s);
		a[1]=getCloseNumber2(s);
		return a;
    }
	/**
	 * 找到最接近这个数且比这个数小的数中的最大数
	 * @param str
	 * @return
	 */
	public static int getCloseNumber1(String str) {
		StringBuilder sb = new StringBuilder(str);
		int start = str.lastIndexOf("10");
		sb.replace(start,start+2,"01");
		String lastStr = sb.substring(start+2);
		StringBuilder lastSb = new StringBuilder();
		int counts=0;
		for(char c:lastStr.toCharArray()) {
			if(c=='1') {
				lastSb.append(1);
			}
			if(c=='0') {
				counts++;
			}
		}
		for(int i=0;i<counts;i++) {
			lastSb.append(0);
		}
		sb.replace(start+2,sb.length(),lastSb.toString());
		return Integer.parseInt(sb.toString(),2);
	}
	/**
	 * 找到最接近这个数且比这个数大的数中的最小数
	 * @param str
	 * @return
	 */
	public static int getCloseNumber2(String str) {
		int start =str.lastIndexOf("01");
		StringBuilder sb = new StringBuilder((start==-1?"0":"")+str);
		start =sb.lastIndexOf("01");
		sb.replace(start,start+2,"10");
		String lastStr = sb.substring(start+2);
		StringBuilder lastSb = new StringBuilder();
		int counts=0;
		for(char c:lastStr.toCharArray()) {
			if(c=='0') {
				lastSb.append(0);
			}
			if(c=='1') {
				counts++;
			}
		}
		for(int i=0;i<counts;i++) {
			lastSb.append(1);
		}
		sb.replace(start+2,sb.length(),lastSb.toString());
		return Integer.parseInt(sb.toString(),2);
	}
}
