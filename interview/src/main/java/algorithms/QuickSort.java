package algorithms;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
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
        quickSort(input);
    }

    private static void quickSort(int[] input){
        quickSort(input,0,input.length-1);
    }

    private static void quickSort(int[] input,int lowIndex,int highIndex){
        if(lowIndex>=highIndex)
            return;

        int pivotIndex = new Random().nextInt(highIndex-lowIndex)+lowIndex;
        int pivot = input[pivotIndex];
        int leftPtr = lowIndex;
        int rightPtr = highIndex;

        swap(input,pivotIndex,highIndex);

        while(leftPtr<rightPtr){
            while (input[leftPtr]<=pivot && leftPtr<rightPtr)
                leftPtr++;
            while (input[rightPtr]>=pivot&&leftPtr<rightPtr)
                rightPtr--;

            swap(input,leftPtr,rightPtr);
        }

        swap(input,leftPtr,highIndex);

        quickSort(input,lowIndex,leftPtr-1);
        quickSort(input,leftPtr+1,highIndex);
    }

    private static void swap(int[] input,int index1,int index2){
        int temp = input[index1];
        input[index1]=input[index2];
        input[index2]=temp;
    }
}
