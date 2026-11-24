package com.example.leetcode;

public class Leetcode_35 {

	public static void main(String[] args) {
//		35. Search Insert Position
//		int[] nums = {1,3,5,6};
//		int target = 5;
		int[] nums = {1,3,5,6};
		int target = 9;
		int result=getInsertPosition(nums,target);
		System.out.println("index "+ result);

	}

	private static int getInsertPosition(int[] nums, int target) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==target) {
				return i;
				
			}else {
//				if((target>nums[i]&&target<nums[i+1])) {
//					return i+1;
//				}
					if(target==nums[i]+1) {
					return i+1;
				}
			}
		}
		return -1;
	}

}
