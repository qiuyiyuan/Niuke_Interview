package com.qiuqiu.practice.interview;

import java.util.HashMap;
import java.util.HashSet;

public class Interview1 {
	public static void main(String[] args) {
		System.out.println(checkDifferent("BarackObama"));
	}
	public static boolean checkDifferent(String iniString) {
        /*boolean isDif = true;
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		char[] charArr = iniString.toCharArray();
        for(int i=0;i<charArr.length;i++) {
        	if(map.get(charArr[i])==null) {
        		map.put(charArr[i],0);
        	}else {
        		isDif=false;
        		break;
        	}
        }
        return isDif;*/
		HashSet<Character> set = new HashSet<Character>();
		for(char c:iniString.toCharArray()) {
			set.add(c);
		}
		return iniString.length()==set.size();
    }
}
