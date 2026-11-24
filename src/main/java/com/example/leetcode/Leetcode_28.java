package com.example.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_28 {

	public static void main(String[] args) {
//		28. Find the Index of the First Occurrence in a String
		String haystack = "sadbutsad", needle = "sad";
//		String haystack = "leetcode", needle = "leeto";
		int result=findOccurenceIndex(haystack,needle);
		System.out.println("The first occurrence is at index "+ result);

	}

	private static int findOccurenceIndex(String haystack, String needle) {
		String splitValue=haystack.replace(needle, ","+needle+",");
		String removingextrachar = splitValue.substring(1, splitValue.length() - 1);
		String[] result=removingextrachar.split(",");
		for(String inputValue:result) {
			if(inputValue.equals(needle)) {
				return inputValue.indexOf(needle);
			}else {
				return -1;
			}
		}
		System.out.println(result);
		return 0;
	}

}
