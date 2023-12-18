package org.example;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        boolean result = true;
        s=s.replaceAll("\\W|\\s|_","").toLowerCase();

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            {
                result=false;
                break;
            }

            if(i>s.length()-1-i)
                break;
        }

        return result;
    }
}
