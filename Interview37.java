package com.qiuqiu.practice.interview;

import java.util.ArrayList;

import com.qiuqiu.practice.interview.dataStructure.Point;

public class Interview37 {
	public static void main(String[] args) {
		
	}
	public static double[] getLine(Point[] p, int n) {
		double[] line = new double[2];
		int max = 0;
		int maxIndex=0;
		ArrayList<Line> list = new ArrayList<Line>();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				Line l = drawLineByTwoPoints(p[i],p[j]);
				list.add(l);
			}
		}
		for(int i=0;i<list.size();i++) {
			int counts=0;
			Line l = list.get(i);
			for(Point point:p) {
				if((point.x*l.k+l.d)==point.y) {
					counts++;
				}
			}
			if(counts>max) {
				max=counts;
				maxIndex=i;
			}
		}
		line[0]=list.get(maxIndex).k;
		line[1]=list.get(maxIndex).d;
		return line;
    }
	public static Line drawLineByTwoPoints(Point a,Point b) {
		double k = (double)(a.y-b.y)/(double)(a.x-b.x);
		double d = a.y-k*a.x;
		return new Line(k, d);
	}
}
class Line{
	double k;//斜率
	double d;//截距
	public Line(double k,double d) {
		this.k=k;
		this.d=d;
	}
}
