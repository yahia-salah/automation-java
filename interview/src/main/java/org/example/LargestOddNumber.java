package org.example;

public class LargestOddNumber {
    public String largestOddNumber(String num) {
        String result="";

        for(int i=num.length()-1;i>=0;i--){
            if(Integer.parseInt(num.charAt(i)+"")%2!=0){
                result = num.substring(0,i+1);
                break;
            }
        }

        return result;
    }
}
