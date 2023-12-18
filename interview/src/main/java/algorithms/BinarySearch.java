package algorithms;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args){
        int[] input = {1,2,5,6,9,11,15,19,25};
        int value = 15;

        System.out.println(search(input,value));
        System.out.println(Arrays.binarySearch(input,value));


        Arrays.sort(input);
    }

    public static int search(int[] input,int value){

        return binarySearch(input,value,0,input.length-1);
    }

    private static int binarySearch(int[] input, int value, int start, int end) {
        if(start>end)
            return -1;

        int mid=start + (end-start)/2;

        if(value==input[mid])
            return mid;
        else if(value<input[mid]){
            return binarySearch(input,value,start,mid-1);
        }
        else{
            return binarySearch(input,value,mid+1,end);
        }
    }
}
