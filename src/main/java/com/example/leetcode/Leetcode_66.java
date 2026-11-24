package com.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_66 {

	public static void main(String[] args) {
//		66. Plus One
//		int[] digits = { 1, 2, 3 };
//		int[] digits = {4,3,2,1};
		int[] digits = {9};
		List<Integer> result = addingOne(digits);
		System.out.println("plus one " + result);

	}

	private static List<Integer> addingOne(int[] digits) {
		List<Integer> ls = new ArrayList<Integer>();
		String concatvalue = "";
		for (int inputvalue : digits) {
			concatvalue += inputvalue + "";
		}
		System.out.println(Integer.parseInt(concatvalue) + 1);
		String re = String.valueOf(Integer.parseInt(concatvalue) + 1);
		for (char inputchar : re.toCharArray()) {
			ls.add(Integer.parseInt(String.valueOf(inputchar)));
		}
		return ls;
	}

}
