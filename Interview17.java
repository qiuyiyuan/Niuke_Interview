package com.qiuqiu.practice.interview;

import java.util.ArrayList;

public class Interview17 {
	public static void main(String[] args) {
		int[][] ope = {{1,1},{1,-1},{2,0},{2,-1}};
		ArrayList<Integer> list = asylum(ope);
		for(Integer i:list) {
			System.out.println(i);
		}
	}
	
	//queue:1 -1 
	public static ArrayList<Integer> asylum(int[][] ope) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		SpecialQueue queue = new SpecialQueue();
		for(int i=0;i<ope.length;i++) {
        	if(ope[i][0]==1) {//收留
        		queue.add(new Animal(ope[i][1]));
        	}
        	if(ope[i][0]==2) {//领养
        		Animal a = queue.poll(ope[i][1]);
        		if(a!=null) {
        			list.add(a.type);
        		}
        	}
        }
		return list;
    }
}
class SpecialQueue{
	ArrayList<Animal> list = new ArrayList<Animal>();
	public SpecialQueue() {
	}
	public void add(Animal a) {
		list.add(a);
	}
	public Animal poll(int type) {
		Animal a = null;
		if(list.size()==0) {
			return a;
		}
		if(type==0) {
			a = list.get(0);
			list.remove(0);
		}
		if(type==1) {
			for(int i=0;i<list.size();i++) {
				if(list.get(i).type>0) {
					a=list.get(i);
					list.remove(i);
					break;
				}
			}
		}
		if(type==-1) {
			for(int i=0;i<list.size();i++) {
				if(list.get(i).type<0) {
					a=list.get(i);
					list.remove(i);
					break;
				}
			}
		}
		return a;
		
	}
}
class Animal{
	int type;
	public Animal(int type) {
		this.type=type;
	}
}
