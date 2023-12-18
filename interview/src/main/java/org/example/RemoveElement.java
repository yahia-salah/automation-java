package org.example;

public class RemoveElement {
    public int removeElement(int[]nums,int val){
        int k=0;

        for(int i=0;i< nums.length;i++){
            if(nums[i]==val)
            {
                k++;
                for(int j=i;j<nums.length-1;j++){
                    nums[j]=nums[j+1];
                }
                nums[nums.length-1]=111;
                i--;
            }
            else if(nums[i]==111)
                break;
        }

        return nums.length-k;
    }
}
