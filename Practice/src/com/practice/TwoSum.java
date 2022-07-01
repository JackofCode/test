package com.practice;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int diff = target - nums[0];
        for(int i = 0 ; i < nums.length; i++){
        	//System.out.println(nums[i]);
        	 
            for(int j = 1 ; j < nums.length ; j++){
               if(nums[j] == diff){
                    result[0] = i;
                    result[1] = j;
                    break;
               }
              diff = target - nums[i];
            }
            
            
        }
        for(int i : result) {

            System.out.println(i);
        }
       return result; 
    }
	
	public static void main(String[] args) {
		int[] input = {3,2,4};
		System.out.println(twoSum(input, 6));
	}
}
