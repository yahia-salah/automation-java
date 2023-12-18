package algorithms;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
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
        boolean swaped=false;

        do{
            swaped=false;
            for(int i=0;i<input.length-1;i++){
                if(input[i]>input[i+1])
                {
                    int temp = input[i];
                    input[i]=input[i+1];
                    input[i+1]=temp;
                    swaped=true;
                }
            }
        }while(swaped);
    }
}
