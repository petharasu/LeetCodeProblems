package com.example.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Leetcode_21 {

	public static void main(String[] args) {
//		merge the 2 list
		int[] list1 = {1,2,4}, list2 = {1,3,4};
		List<Integer> result=mergeList(list1,list2);
		System.out.println("merge list "+ result);

	}

	private static List<Integer> mergeList(int[] list1, int[] list2) {
		List<Integer> ls=new ArrayList<Integer>();
		for(int i=0;i<list1.length;i++) {
			ls.add(list1[i]);
		}for(int i=0;i<list2.length;i++) {
			ls.add(list2[i]);
		}
		ls.sort(Comparator.naturalOrder());
		return ls;
	}

}
