package com.qiuqiu.practice.interview;

import java.util.HashMap;

public class Interview3 {
	public static void main(String[] args) {
		System.out.println(checkSam("This is nowcoder","is This nowcoder"));
		System.out.println(checkSam("Here you are","Are you here"));
	}
	
	public static boolean checkSam(String stringA, String stringB) {
        // write code here
		boolean same=true;
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		for(char c:stringA.toCharArray()) {
			if(map.get(c)==null) {
				map.put(c,1);
			}else {
				map.put(c,map.get(c)+1);
			}
		}
		for(char c:stringB.toCharArray()) {
			if(map.get(c)==null || map.get(c)==0) {
				same=false;
				break;
			}else {
				map.put(c,map.get(c)-1);
			}
		}
		return same;
    }
}
