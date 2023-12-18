package algorithms;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
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
        for(int i=1;i<input.length;i++){
            int temp = input[i];

            int j=i-1;
            while (j>=0 && input[j]>temp){
                input[j+1]=input[j];
                j--;
            }
            input[j+1]=temp;
        }
    }
}
