package org.example;

import java.util.Arrays;

public class SumSubArray {
    public static void main(String[] args){
        solve(new int[]{5,3,1,7,6,8,4,9},9);
    }
    public static void solve(int[] input,int x){
        int start=0,end=0,sum=0;

        while (sum<=x && start<=end && end<input.length){
            sum+=input[end];

            if(sum>x){
                sum-=input[start];
                start++;
            }

            if(sum==x) {
                System.out.println(Arrays.toString(Arrays.copyOfRange(input,start,end+1)));
                break;
            }

            end++;
        }
    }
}
