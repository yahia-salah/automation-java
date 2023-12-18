package algorithms;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
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
        for(int i=0;i<input.length-1;i++){
            int minimumIndex = i;
            int minimum = input[minimumIndex];

            for (int j=i+1;j<input.length;j++){
                if(input[j]<minimum)
                {
                    minimumIndex=j;
                    minimum=input[minimumIndex];
                }
            }

            input[minimumIndex]=input[i];
            input[i]=minimum;
        }
    }
}
