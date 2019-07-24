package com.qiuqiu.practice.interview;

public class Interview5 {
	public static void main(String[] args) {
		System.out.println(zipString("aabcccccaaa"));
		System.out.println(zipString("welcometonowcoderrrrr"));
	}
	public static String zipString(String iniString) {
		StringBuilder sb = new StringBuilder();
		Character currentChar=null;
		int counts=0;
		for(char c:iniString.toCharArray()) {
			//当前字符与上一个字符不同
			if(!Character.valueOf(c).equals(currentChar)) {
				if(counts!=0) {
					sb.append(currentChar).append(counts);
					counts=0;
				}
				currentChar=c;
				counts++;
			}else {//当前字符与上一个字符相同
				counts++;
			}
		}
		sb.append(iniString.charAt(iniString.length()-1)).append(counts);
		return sb.toString().length()>=iniString.length()?iniString:sb.toString();
	}
}
