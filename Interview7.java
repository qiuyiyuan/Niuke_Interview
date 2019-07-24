package com.qiuqiu.practice.interview;

import java.util.HashSet;

public class Interview7 {
	public static void main(String[] args) {
		int[][] originalMat = {{1,2,3},{0,1,2},{0,0,1}}; 
		int[][] lastMat = clearZero(originalMat,originalMat.length);
		for(int[] tempArr:lastMat) {
			for(int i:tempArr) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	public static int[][] clearZero(int[][] mat, int n) {
		HashSet<Integer> rowSet = new HashSet<Integer>();
		HashSet<Integer> columnSet = new HashSet<Integer>();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(mat[i][j]==0) {
					rowSet.add(i);
					columnSet.add(j);
				}
			}
		}
		for(Integer i:rowSet) {
			for(int j=0;j<n;j++) {
				mat[i][j]=0;
			}
		}
		for(Integer i:columnSet) {
			for(int j=0;j<n;j++) {
				mat[j][i]=0;
			}
		}
		return mat;
    }
}
