package com.qiuqiu.practice.interview;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 此题英文拼写错误，有向图节点应为DirectedGraphNode
 * @author Administrator
 *
 */
public class Interview19 {
	public static void main(String[] args) {
		
	}
	public static boolean checkPath(UndirectedGraphNode a, UndirectedGraphNode b) {
		if(a==null||b==null) {
			return false;
		}
		HashSet<UndirectedGraphNode> map = new HashSet<UndirectedGraphNode>();
		boolean res = checkPathCore(a,b,map);
		map.clear();
		return res||checkPathCore(b,a,map);
    }
	
	public static boolean checkPathCore(UndirectedGraphNode a, UndirectedGraphNode b,HashSet<UndirectedGraphNode> map) {
		if(a==b) {
			return true;
		}
		map.add(a);//标记a已被访问
		for(int i=0;i<a.neighbors.size();i++) {
			if(!map.contains(a.neighbors.get(i))&&checkPathCore(a.neighbors.get(i),b,map)) {
				return true;
			}
		}
		return false;
    }
}
class UndirectedGraphNode {
    int label = 0;
    UndirectedGraphNode left = null;
    UndirectedGraphNode right = null;
    ArrayList<UndirectedGraphNode> neighbors = new ArrayList<UndirectedGraphNode>();

    public UndirectedGraphNode(int label) {
        this.label = label;
    }
}