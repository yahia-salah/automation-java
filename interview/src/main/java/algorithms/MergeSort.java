package algorithms;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args){
        Random rand=new Random();

        int[] input = new int[10];
        for(int i=0;i<input.length;i++){
            input[i]=rand.nextInt(100);
        }

        System.out.println("Before");
        System.out.println(Arrays.toString(input));
        sort(input);
        System.out.println("After");
        System.out.println(Arrays.toString(input));
    }

    public static void sort(int[] input){
        mergeSort(input);
    }

    private static void mergeSort(int[] input) {
        if(input.length<2)
            return;

        int length=input.length;
        int midIndex = length/2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[length-midIndex];

        for(int i=0;i<midIndex;i++)
        {
            leftHalf[i]=input[i];
        }
        for(int i=midIndex;i<length;i++)
        {
            rightHalf[i-midIndex]=input[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(input,leftHalf,rightHalf);
    }

    private static void merge(int[] input, int[] leftHalf, int[] rightHalf) {
        int leftSize=leftHalf.length;
        int rightSize=rightHalf.length;

        int i=0,j=0,k=0;

        while (i<leftSize && j<rightSize){
            if(leftHalf[i]<=rightHalf[j]){
                input[k]=leftHalf[i];
                i++;
            }
            else
            {
                input[k]=rightHalf[j];
                j++;
            }
            k++;
        }
        while (i<leftSize){
            input[k]=leftHalf[i];
            i++;
            k++;
        }
        while (j<rightSize){
            input[k]=rightHalf[j];
            j++;
            k++;
        }
    }
}
