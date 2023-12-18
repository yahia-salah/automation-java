package org.example;

public class MergeSortedArray {
    public void merge(int[] nums1,int m,int[] nums2,int n){
        for(int i=0;i<n;i++){
            int num2 = nums2[i];
            for(int j=0;j<m+n;j++){
                if(num2<nums1[j])
                {
                    for(int k=m+n-1;k>j;k--){
                        nums1[k]=nums1[k-1];
                    }
                    nums1[j]=num2;
                    break;
                }
                else if(j>m+i)
                {
                    nums1[j]=num2;
                    break;
                }
            }
        }
    }
}
