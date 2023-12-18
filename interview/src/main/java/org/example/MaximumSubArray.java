package org.example;

public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int sumMax = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

            if(sum>sumMax)
                sumMax=sum;

            if(sum<0)
                sum=0;
        }

        return sumMax;
    }
}
