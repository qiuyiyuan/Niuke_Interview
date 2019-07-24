package com.qiuqiu.practice.interview;

public class Interview27 {
	public static void main(String[] args) {
		System.out.println(printBin(0.625));
	}
	public static String printBin(double num) {
        // write code here
		StringBuilder sb = new StringBuilder("0.");
		int counts=0;
		double x=0.5;
		while(num>0&&counts<=32) {
			if(num==x) {
				counts++;
				sb.append(1);
				return sb.toString();
			}else if(num>x) {
				counts++;
				sb.append(1);
				num-=x;
				x/=2.0;
			}else {
				counts++;
				sb.append(0);
				x/=2;
			}
		}
		return "Error";
    }
}
