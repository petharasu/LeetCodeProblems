package com.example.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode_26 {

	public static void main(String[] args) {
//		26. Remove Duplicates from Sorted Array
//		List<Integer> nums = Arrays.asList(1,1,2);
		List<Integer> nums = Arrays.asList(0,0,1,1,1,2,2,3,3,4);
		int result=removeDuplicate(nums);
		System.out.println("Count of unique values "+ result);

	}

	private static int removeDuplicate(List<Integer> nums) {
		Set<Integer> set=new HashSet<Integer>();
		for(Integer inputValue:nums) {
			set.add(inputValue);
		}
		System.out.println("values "+set);
		return set.size();
	}

}
