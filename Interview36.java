package com.qiuqiu.practice.interview;

import com.qiuqiu.practice.interview.dataStructure.Point;

public class Interview36 {
	public static void main(String[] args) {
		//[(136,6278),(3958,6278),(3958,2456),(136,2456)],
		//[(-3898,11132),(7238,11132),(7238,-4),(-3898,-4)]
		Point[] A = new Point[4];
		A[0]=new Point(136,6278);
		A[1]=new Point(3958,6278);
		A[2]=new Point(3958,2456);
		A[3]=new Point(136,2456);
		Point[] B = new Point[4];
		B[0]=new Point(-3898,11132);
		B[1]=new Point(7238,11132);
		B[2]=new Point(7238,-4);
		B[3]=new Point(-3898,-4);
		double[] line = getBipartition(A, B);
		System.out.println(line[0]+" "+line[1]);
	}
	public static double[] getBipartition(Point[] A, Point[] B) {
        // write code here
		double[] centerOfA = new double[2];
		double[] centerOfB = new double[2];
		double[] line = new double[2];
		centerOfA[0]=(A[0].x+A[1].x+A[2].x+A[3].x)/4.0;
		centerOfA[1]=(A[0].y+A[1].y+A[2].y+A[3].y)/4.0;
		centerOfB[0]=(B[0].x+B[1].x+B[2].x+B[3].x)/4.0;
		centerOfB[1]=(B[0].y+B[1].y+B[2].y+B[3].y)/4.0;
		double k = (centerOfB[1]-centerOfA[1])/(centerOfB[0]-centerOfA[0]);
		double d = centerOfA[1]-k*centerOfA[0];
		String lineK = String.format("%.5f",k);
		String lineD = String.format("%.5f",d);
		line[0] = Double.parseDouble(lineK);
		line[1] = Double.parseDouble(lineD);
		return line;
    }
}
