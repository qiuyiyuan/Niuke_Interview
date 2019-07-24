package com.qiuqiu.practice.interview;

public class Interview6 {
	public static void main(String[] args) {
		int[][] originalMat = {{1,2,3},{4,5,6},{7,8,9}}; 
		int[][] lastMat = transformImage(originalMat,originalMat.length);
		for(int[] tempArr:lastMat) {
			for(int i:tempArr) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	public static int[][] transformImage(int[][] mat, int n) {
		int[][] rotateMat = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				//原来坐标i,j
				//顺时针旋转90°后列数变为行数,n-行数-1变为列数
				rotateMat[j][n-i-1]=mat[i][j];
			}
		}
		return rotateMat;
    }
}
