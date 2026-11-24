package com.example.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode_217 {

	public static void main(String[] args) {
//		217.contains duplicats
		List<Integer> nums = Arrays.asList(1,2,3);
//		List<Integer> nums = Arrays.asList(1,1,1,3,3,4,3,2,4,2);
		boolean result=calculateOccurence(nums);
		System.out.println("occurence " + result);

	}

	private static boolean calculateOccurence(List<Integer> nums) {
		Map<Integer,Integer> ls=gettheElementcount(nums);
		for(Integer input:ls.keySet()) {
			if(ls.get(input)>1) {
				return true;
			}else {
				return false;
				
			}
		}
		return false;
	}

	private static Map<Integer,Integer> gettheElementcount(List<Integer> nums) {
		Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(Integer inptValue:nums) {
			hm.put(inptValue, hm.getOrDefault(inptValue, 0)+1);
		}
		System.out.println("map  "+hm);
		return hm;
	}

}
