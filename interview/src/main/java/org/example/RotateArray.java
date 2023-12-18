package org.example;

import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {
//        for (int i=0;i<k;i++){
//            int last=nums[nums.length-1];
//            for(int j= nums.length-1;j>0;j--){
//                nums[j]=nums[j-1];
//            }
//            nums[0]=last;
//        }

        int[] numsCopy = Arrays.copyOf(nums,nums.length);

        for(int i=0;i<nums.length;i++)
        {
            nums[(i+k)%nums.length]=numsCopy[i];
        }
    }
}
