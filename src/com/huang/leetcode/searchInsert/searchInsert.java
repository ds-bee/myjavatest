package com.huang.leetcode.searchInsert;

class Solution {
    public int searchInsert(int[] nums, int target) {

        int[] ints = new int[nums.length + 1];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < target ){
                ints[i] = nums[i];
                index++;

            }
            if(index == nums.length){
                nums[i+1] = target;
                index++;
            }
        }
        return index;
    }
}