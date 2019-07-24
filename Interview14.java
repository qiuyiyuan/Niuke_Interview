package com.qiuqiu.practice.interview;

import java.util.ArrayList;

public class Interview14 {
	public static void main(String[] args) {
		int[][] arr = {{1,97868},{1,69995},{1,28525},{1,72341},{1,86916},{1,5966},{2,58473},{2,93399},{1,84955},{1,16420},{1,96091},{1,45179},{1,59472},{1,49594},{1,67060},{1,25466},{1,50357},{1,83509},{1,39489},{2,51884},{1,34140},{1,8981},{1,50722},{1,65104},{1,61130},{1,92187},{2,2191},{1,2908},{1,63673},{2,92805},{1,29442}};
		ArrayList<ArrayList<Integer>> result = setOfStacks(arr, 2);
		for(ArrayList<Integer> iArr:result) {
			for(Integer i:iArr) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	public static ArrayList<ArrayList<Integer>> setOfStacks(int[][] ope, int size) {
		//结果栈
		ArrayList<ArrayList<Integer>> setOfStacks = new ArrayList<ArrayList<Integer>>();
		int stackIndex=0;
		int counts=0;
		ArrayList<Integer> currentStack = new ArrayList<Integer>();
		setOfStacks.add(currentStack);
		for(int i=0;i<ope.length;i++) {
			//入栈
			if(ope[i][0]==1) {
				if(counts==size) {
					currentStack=new ArrayList<Integer>();
					setOfStacks.add(currentStack);
					stackIndex++;
					counts=0;
				}
				currentStack.add(ope[i][1]);
				counts++;
			}
			//出栈
			if(ope[i][0]==2) {
				if(counts==1) {
					setOfStacks.remove(stackIndex);
					currentStack=setOfStacks.get(--stackIndex);
					counts=size;
				}else {
					currentStack.remove(--counts);
				}
			}
		}
		return setOfStacks;
    }
}
