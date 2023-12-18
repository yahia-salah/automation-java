package org.example;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums){
        int k = 0;

        for(int i=1;i<nums.length;i++) {
            if (nums[i] == nums[i - 1]) {
                k++;
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - 1] = 111;
                i--;
            } else if (nums[i] == 111) {
                break;
            }
        }

        return nums.length-k;
    }
}
