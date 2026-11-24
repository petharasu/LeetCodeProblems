package com.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_27 {
//	27. Remove Element
	public static void main(String[] args) {
//		List<Integer> nums = Arrays.asList(3,2,2,3);
//		int val = 3;
		List<Integer> nums = Arrays.asList(0,1,2,2,3,0,4,2);
		int val = 2;
		int result=removeElement(nums,val);
		System.out.println("count "+ result);

	}

	private static int removeElement(List<Integer> nums, int val) {
		List<Integer> ls=new ArrayList<Integer>();
		for(Integer inputValue:nums) {
			if(inputValue!=val) {
				ls.add(inputValue);
			}
		}
		return ls.size();
	}

	

}
