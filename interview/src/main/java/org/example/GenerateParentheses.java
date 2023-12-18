package org.example;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        int binary = 0b0;

        for(int i=0;i<Math.pow(2,n*2);i++){
            String pattern = convertBinaryToPattern(binary,n*2);
            int parentheses = 0;

            for(int j=0;j<pattern.length();j++){
                char c = pattern.charAt(j);

                if(c=='(')
                    parentheses+=1;
                else
                    parentheses-=1;

                if(parentheses<0)
                    break;
            }

            if(parentheses==0)
                result.add(pattern);

            binary+=0b1;
        }

        return result;
    }

    private String convertBinaryToPattern(int binary, int bits){
        String pattern = "";

        for(int i=0;i<bits;i++)
        {
            pattern+=(binary&(int)Math.pow(2,i))>0?"(":")";
        }

        return pattern;
    }

    public static void main(String[] args){
        var obj = new GenerateParentheses();

        System.out.println(obj.generateParenthesis(8));
    }
}
