package org.example;

public class RemoveDuplicatesII {
    public int removeDuplicates(int[] nums){
        int k = 0;
        int num=nums[0];
        int count = 1;

        for(int i=1;i<nums.length;i++) {
            if (nums[i] == 100000) {
                break;
            }

            if(nums[i]==num)
            {
                count++;

                if(count>2){
                    k++;
                    for (int j = i; j < nums.length - 1; j++) {
                        nums[j] = nums[j + 1];
                    }
                    nums[nums.length - 1] = 100000;
                    i--;
                }
            }
            else {
                num=nums[i];
                count=1;
            }
        }

        return nums.length-k;
    }
}
