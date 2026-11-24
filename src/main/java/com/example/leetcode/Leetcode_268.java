package com.example.leetcode;

import java.util.Arrays;
import java.util.List;

public class Leetcode_268 {

	public static void main(String[] args) {
//		Missing Number
//		List<Integer> nums = Arrays.asList(3,0,1);
//		List<Integer> nums = Arrays.asList(0,1);
		List<Integer> nums = Arrays.asList(9,6,4,2,3,5,7,0,1);
		int result=findMissingNumber(nums,nums.size());
		System.out.println("Mising number list "+ result); 
		

	}

	private static int findMissingNumber(List<Integer> nums, int length) {
		
		int finalValue = 0;
//		System.out.println("len"+ length);
		for(int i=0;i<=length;i++) {
			if(nums.contains(i)) {
				System.out.println("Index value " +i);
				continue;
			}else {
				finalValue=i;
				continue;
			}
		}
		return finalValue;
	}

}
